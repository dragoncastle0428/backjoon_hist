import sys

def function(array, num, choice):
    if num == 0:
        for i in array:
            print(choice[i], end=' ')
        print("")
    else:
        for i in range(0, n):
            if i not in array:
                function(array + [i], num - 1, choice)

n, m = map(int, sys.stdin.readline().split())
choice = sorted(list(map(int, sys.stdin.readline().split())))
function([], m, choice)