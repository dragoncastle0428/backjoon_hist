import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
b = []

for i in range(n):
    b.append([a[i], i])

b.sort()
count = 0
i = 0

while (i < n):
    temp = i + 1
    for j in range(i+1, n):
        if b[i][0] == b[j][0]:
            temp = j + 1
            b[j][0] = count
    b[i][0] = count
    i = temp
    count += 1

b.sort(key=lambda x: x[1])

for i in b:
    print(i[0], end=' ')
