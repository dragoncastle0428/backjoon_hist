import sys

n = int(sys.stdin.readline())
input_list = sys.stdin.readline().split()
searchA = {input_list[i]: True for i in range(0, n)}
m = int(sys.stdin.readline())
array2 = list(sys.stdin.readline().split())

for i in array2:
    if i in searchA:
        print(1)
    else:
        print(0)