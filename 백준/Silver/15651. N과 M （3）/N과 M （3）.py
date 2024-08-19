import sys

result = []

def function(array, num):
    if num == 0:
        print(*array)
    else:
        for i in range(1, n+1):
            array2 = array + [i]
            function(array2, num - 1)

n, m = map(int, sys.stdin.readline().split())
function([], m)