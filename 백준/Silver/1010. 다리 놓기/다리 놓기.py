import math
import sys

t = int(sys.stdin.readline())

for i in range(t):
    n, m = map(int, sys.stdin.readline().split())
    print(int(math.factorial(m)/(math.factorial(m-n) * math.factorial(n))))