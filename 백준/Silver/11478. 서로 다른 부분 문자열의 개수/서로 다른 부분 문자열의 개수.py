import sys

n = sys.stdin.readline().strip()
s = set({})

for i in range(1, len(n)+1):
    start = 0
    end = start + i
    while end < len(n)+1:
        s.add(n[start:end])
        start += 1
        end = start + i

print(len(s))