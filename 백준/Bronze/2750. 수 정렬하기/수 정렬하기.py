import sys

n = (int)(sys.stdin.readline())
array = []

for i in range(n):
    num = (int)(sys.stdin.readline())
    array.append(num)

array.sort()

for i in array:
    print(i)