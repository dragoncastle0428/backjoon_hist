import sys

n = int(sys.stdin.readline())
l = list(map(int, sys.stdin.readline().split()))
l.sort()

if n == 1:
    print(l[0]**2)
else:
    print(l[0]*l[n-1])