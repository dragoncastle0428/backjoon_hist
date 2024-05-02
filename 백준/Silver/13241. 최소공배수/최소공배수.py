import sys
num1, num2 = map(int, sys.stdin.readline().split())
result = 0
big = 0
small = 0

if num1 < num2:
    big = num2
    small = num1
else:
    big = num1
    small = num2

while small != 0:
    r = big%small
    big = small
    small = r
print(int(num1*num2/big))