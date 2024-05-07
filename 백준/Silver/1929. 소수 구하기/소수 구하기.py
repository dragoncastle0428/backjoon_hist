import sys

n, m = map(int, sys.stdin.readline().split())
a = [2, 7, 61]

if n <= 2:
    print(2)
    n = 3

if n%2 == 0:
    n += 1

for i in range(n, m+1, 2):
    if i == 7 or i == 61:
        print(i)
        continue
    d = i - 1
    r = 0
    while d % 2 == 0:
        d /= 2
        r += 1

    check = True
    for j in a:
        x = pow(j, int(d), i)

        if x != 1 and x != i - 1:
            check2 = True
            for k in range(r):
                x = pow(x, 2, i)
                if x == i - 1:
                    check2 = False
                    break
            if check2:
                check = False

    if check:
        print(i)