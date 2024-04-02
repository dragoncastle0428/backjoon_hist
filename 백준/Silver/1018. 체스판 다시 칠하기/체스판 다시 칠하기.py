import sys

n, m = map(int, sys.stdin.readline().split())

array = []

for i in range(n):
    b = list(sys.stdin.readline())
    b.remove('\n')
    array.append(b)

result = []

for i in range(n-7):
    for j in range(m-7):
        wb = 0
        bb = 0
        for a in range(i, i+8):
            for b in range(j, j+8):
                if (a + b)%2 == 0:
                    if array[a][b] == 'W':
                        wb += 1
                    else:
                        bb += 1
                else:
                    if array[a][b] == 'B':
                        wb += 1
                    else:
                        bb += 1

        result.append(wb)
        result.append(bb)

print(min(result))
