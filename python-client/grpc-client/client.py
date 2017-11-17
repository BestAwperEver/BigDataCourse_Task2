import threading
from queue import Queue

import grpc

import simple_pb2_grpc
import simple_pb2

THREADS_NUMBER = 10
NUMBERS_QUEUE = Queue()
END_OF_SEQUENCE = -2
WRITE_QUEUE = Queue()  # thread-safe


def thread_writer():
    with open(path, 'w') as outfile:
        while True:
            line = WRITE_QUEUE.get()
            print(line)
            if line == 'end':
                break
            outfile.write(line+'\n')
            WRITE_QUEUE.task_done()
        outfile.flush()
        outfile.close()


def thread_worker():
    while True:
        if NUMBERS_QUEUE.not_empty:
            nextInt = NUMBERS_QUEUE.get()
            if nextInt == END_OF_SEQUENCE:
                break
            request = simple_pb2.FactorRequest(number=nextInt)
            res = stub.getFactorization(request).formattedFactorized
            NUMBERS_QUEUE.task_done()
            WRITE_QUEUE.put(res)  # returns a string


if __name__ == '__main__':
    channel = grpc.insecure_channel('localhost:5757')
    stub = simple_pb2_grpc.SampleServiceStub(channel)
    path = 'out.txt'

    writer = threading.Thread(target=thread_writer)

    workers = []

    for i in range(THREADS_NUMBER):
        workers.append(threading.Thread(target=thread_worker))

    writer.start()

    for worker in workers:
        worker.start()

    fileName = 'file.txt'
    with open(fileName) as f:
        line = f.readline()
        while line:
            NUMBERS_QUEUE.put(int(line))
            line = f.readline()

    NUMBERS_QUEUE.join()

    for i in range(THREADS_NUMBER):
        NUMBERS_QUEUE.put(END_OF_SEQUENCE)

    for worker in workers:
        worker.join()

    WRITE_QUEUE.join()

    WRITE_QUEUE.put('end')
    writer.join()
