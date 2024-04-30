import sys
n, m = map(int, sys.stdin.readline().split())
s = {}

for i in range(1, n+1):
    ip = sys.stdin.readline().strip()
    s[ip] = str(i)
    s[str(i)] = ip

for i in range(m):
    ip = sys.stdin.readline().strip()
    print(s[ip])