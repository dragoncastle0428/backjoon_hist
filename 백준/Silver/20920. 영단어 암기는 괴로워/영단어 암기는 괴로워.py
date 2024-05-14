import sys

n, m = map(int, sys.stdin.readline().split())
l = {}

for i in range(n):
    ip = sys.stdin.readline().rstrip()
    if len(ip) >= m:
        if ip in l:
            l[ip] += 1
        else:
            l[ip] = 1

sorted_items = sorted(l.items(), key=lambda item: (-item[1], -len(item[0]), item[0]))

for key, value in sorted_items:
    print(key)