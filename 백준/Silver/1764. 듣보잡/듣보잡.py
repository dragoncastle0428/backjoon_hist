import sys
n, m = map(int, sys.stdin.readline().split())
s1 = set({})
s2 = set({})

for i in range(n):
    s1.add(sys.stdin.readline().strip())

for i in range(m):
    s2.add(sys.stdin.readline().strip())

result = sorted(list(s1 & s2))

print(len(result))
print(*result, sep='\n')