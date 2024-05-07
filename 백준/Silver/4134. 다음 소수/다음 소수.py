import sys

n = int(sys.stdin.readline())
for i in range(n):
    num = int(sys.stdin.readline())
    a = [2]

    if num <= 2:
        print(2)
        continue
    elif num%2 == 0:
        num += 1

    check = True
    while check:
        check = False
        d = num - 1
        r = 0
        while d%2 == 0:
            d /= 2
            r += 1

        for j in a:
            x = pow(j, int(d), num)

            if x != 1 and x != num-1:
                check2 = True
                for k in range(r):
                    x = pow(x, 2, num)
                    if x == num-1:
                        check2 = False
                        break
                if check2:
                    check = True
                    num += 2
                    break
    print (num)