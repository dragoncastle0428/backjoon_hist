import sys
n = int(sys.stdin.readline())
n = list(map(int, sys.stdin.readline().split()))
s = {}

for i in n:
    if i in s:
        s[i] += 1
    else:
        s[i] = 1

m = int(sys.stdin.readline())
m = list(map(int, sys.stdin.readline().split()))

for i in m:
    if i in s:
        print(s[i], end= ' ')
    else:
        print(0, end= ' ')