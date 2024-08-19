import sys

result = []

def function(array, num):
    if num == 0:
        print(*array)
    else:
        for i in range(1, n+1):
            if len(array) == 0:
                function(array + [i], num - 1)
            elif i >= array[-1]:
                function(array + [i], num - 1)


n, m = map(int, sys.stdin.readline().split())
function([], m)