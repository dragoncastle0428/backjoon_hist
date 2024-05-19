import sys

def recursive(n):
    if n > 1:
        gap = n//3
        for i in range(gap, num, gap*3):
            for j in range(gap, num, gap*3):
                for a in range(i, i+gap):
                    for b in range(j, j+gap):
                        l[a][b] = " "
        recursive(gap)

num = int(sys.stdin.readline())
l = [["*" for _ in range(num)] for _ in range(num)]
recursive(num)
for i in l:
    print(*i, sep='')