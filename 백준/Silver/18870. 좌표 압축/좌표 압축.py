import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
b = sorted(list(set(a)))
result = dict(zip(b, list(range(len(b)))))

for i in a:
    print(result[i], end=' ')