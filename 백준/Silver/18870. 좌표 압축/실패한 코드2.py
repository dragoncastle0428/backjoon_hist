import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
b = sorted(set(a))

for i in range(len(b)):
    for j in range(n):
        if a[j] == b[i]:
            a[j] = i

print(*a)
