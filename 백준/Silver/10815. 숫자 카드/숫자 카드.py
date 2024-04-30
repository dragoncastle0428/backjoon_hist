import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
a.sort()
m = int(sys.stdin.readline())
b = list(map(int, sys.stdin.readline().split()))
result = []

for i in b:
    start = 0
    end = n-1
    check = 0
    while (start <= end):
        mid = int((start+end)/2)
        if a[mid] == i:
            check = 1
            break
        elif a[mid] > i:
            end = mid-1
        else:
            start = mid+1
    result.append(check)

print(*result)