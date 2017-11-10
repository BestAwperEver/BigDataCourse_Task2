from numpy import random

f = open("file.txt", 'w')

for i in range(5000):
    f.write(str(random.randint(0, 1000000)) + '\n')

f.flush()
f.close()
