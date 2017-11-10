import threading
from queue import Queue

import grpc

import simple_pb2_grpc
# import simple_pb2

THREADS_NUMBER = 2
NUMBERS_QUEUE = Queue()
END_OF_SEQUENCE = -2
WRITE_QUEUE = Queue()  # thread-safe


def thread_writer(path):
    outFile = open(path, 'w')
    while True:
        line = ''
        while WRITE_QUEUE.qsize():
            line = WRITE_QUEUE.get()
            if line == 'end':
                break
            outFile.write(WRITE_QUEUE.get())
        if line == 'end':
            break
    outFile.flush()
    outFile.close()


def thread_worker(stub):
    while True:
        if NUMBERS_QUEUE.not_empty():
            nextInt = NUMBERS_QUEUE.get()
            if nextInt == END_OF_SEQUENCE:
                break
            WRITE_QUEUE.put(stub.getFactorization(nextInt))  # returns a string


if __name__ == '__main__':
    channel = grpc.insecure_channel('localhost:5757')
    stub = simple_pb2_grpc.SampleServiceStub(channel)

    writer = threading.Thread(target=thread_writer, args='out.txt')

    workers = []

    for i in range(THREADS_NUMBER):
        workers.append(threading.Thread(target=thread_worker, args=stub))

    writer.start()

    for worker in workers:
        worker.start()

    fileName = 'file.txt'
    with open(fileName) as f:
        line = f.readline()
        while line:
            NUMBERS_QUEUE.put(int(line))
            line = f.readline()

    WRITE_QUEUE.put('end')
    for i in range(THREADS_NUMBER):
        NUMBERS_QUEUE.put(END_OF_SEQUENCE)
    
    writer.join()
    for worker in workers:
        worker.join()
