import sys

n = int(sys.stdin.readline())

a = list(map(int, sys.stdin.readline().split()))
b = list(map(int, sys.stdin.readline().split()))

m = int(sys.stdin.readline())
c = list(map(int, sys.stdin.readline().split()))

b2 = []
front = -1
end = -1

for i in range(n):
    if a[i] == 0:
        end += 1
        b2.append(b[i])

b2.reverse()

if front == end:
    print(*c)
else:
    b2.extend([0 for _ in range(m)])
    for i in c:
        front += 1
        end += 1
        b2[end] = i
        print(b2[front], end= ' ')