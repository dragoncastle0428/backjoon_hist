import sys

n, m = map(int, sys.stdin.readline().split())
array = list(map(int,sys.stdin.readline().split()))

min = 9999999999

for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            sub = m - (array[i] + array[j] + array[k])
            if (sub < min) and (sub >= 0):
                min = sub

print(m - min)