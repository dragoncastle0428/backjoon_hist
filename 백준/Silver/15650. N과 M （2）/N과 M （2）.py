import sys

result = []

def function(array, num):
    if num == 0:
        result.append(sorted(array))
    else:
        for i in range(1, n+1):
            if i not in array:
                function(array + [i], num - 1)

n, m = map(int, sys.stdin.readline().split())
function([], m)

result = sorted(list(set(map(tuple, result))))

for i in result:
    print(*i)