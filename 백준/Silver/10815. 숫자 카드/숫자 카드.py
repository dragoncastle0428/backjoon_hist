import sys

n = int(sys.stdin.readline())
n = list(map(int, sys.stdin.readline().split()))
m = int(sys.stdin.readline())
m = list(map(int, sys.stdin.readline().split()))
sets = {}

for i in n:
    sets[i] = 1

for i in m:
    if i in sets:
        print(1, end= ' ')
    else:
        print(0, end= ' ')