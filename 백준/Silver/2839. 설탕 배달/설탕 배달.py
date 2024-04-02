import sys

n = (int)(sys.stdin.readline())

count = -1

start = (int)(n/5)

for i in range(start, -1, -1):
    left = n - i*5

    if left%3 == 0:
        count = (int)(i + left/3)
        break

print(count)