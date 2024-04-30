import sys
n, m = map(int, sys.stdin.readline().split())
sets = {}
result = 0

for i in range(n):
    sets[sys.stdin.readline()] = 1

for i in range(m):
    ip = sys.stdin.readline()
    if ip in sets:
        result += 1

print(result)