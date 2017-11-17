from numpy import random

f = open("file.txt", 'w')

for i in range(5000):
    f.write(str(random.randint(0, 1000000)) + '\n')

# for i in range(50):
#     f.write(str(i) + '\n')

f.flush()
f.close()
