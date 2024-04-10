import sys

n = int(sys.stdin.readline())
a = []

for _ in range(n):
    a.append(sys.stdin.readline().split())

a.sort(key=lambda x: int(x[0]))

for i in a:
    print(i[0], i[1])
