import sys
n = int(sys.stdin.readline())
array = []
lcd = 0
sum = 0

for i in range(n):
    array.append(int(sys.stdin.readline()))
    if i == 1:
        lcd = array[i] - array[i - 1]
        sum += lcd
    if i > 1:
        diff = array[i] - array[i-1]
        sum += diff
        while lcd != 0:
            r = diff%lcd
            diff = lcd
            lcd = r
        lcd = diff

print(int(sum/lcd) - n + 1)