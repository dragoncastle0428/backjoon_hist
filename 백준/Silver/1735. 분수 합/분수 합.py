import sys
a1, b1 = map(int, sys.stdin.readline().split())
a2, b2 = map(int, sys.stdin.readline().split())

A = a1*b2 + a2*b1
B = b1*b2
big = 0
small = 0

if A > B:
    big = A
    small = B
else:
    big = B
    small = A

while small != 0:
    r = big%small
    big = small
    small = r

print(int(A/big), int(B/big))