import sys
n, m = map(int, sys.stdin.readline().split())

a = set(map(int, sys.stdin.readline().split()))
b = set(map(int, sys.stdin.readline().split()))

result = len(a-b)
result += len(b-a)
print(result)