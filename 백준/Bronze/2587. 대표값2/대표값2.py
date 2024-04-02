import sys

array = []
sum = 0

for i in range(5):
    num = (int)(sys.stdin.readline())
    sum += num
    array.append(num)

array.sort()
print((int)(sum/5))
print(array[2])
