import sys

num = 0


def recursive(n):
    if n > 0:
        erase = False
        gap = 3 ** (n - 1)
        for i in range(0, size, gap):
            if erase:
                for j in range(i, i + gap):
                    l[j] = " "
            erase = not erase
        recursive(n - 1)


while True:
    try:
        num = int(sys.stdin.readline())
        size = 3 ** num
        l = ["-" for _ in range(size)]
        recursive(num)
        print(*l, sep='')
    except:
        break