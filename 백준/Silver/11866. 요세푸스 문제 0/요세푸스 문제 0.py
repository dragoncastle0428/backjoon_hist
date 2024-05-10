import sys

n, m = map(int, sys.stdin.readline().split())
l = [i for i in range(1, n+1)]
index = 0
result = []

while n != 0:
    index = (index + m - 1) % n
    n -= 1
    result.append(l.pop(index))

print('<', end='')
print(*result, sep=', ', end='')
print('>')