from math import *
import sys

def prime(num):
    if num <= 1:
        return 0
    if num % 2 == 0:
        return 0
    for i in range(3, int(sqrt(num)) + 1, 2):
        if num % i == 0:
            return 0
    return 1


while True:
    n = int(sys.stdin.readline())

    if n == 0:
        break

    m = n + 1
    result = 0

    if n < 2:
        result = 1

    if m % 2 == 0:
        m += 1

    n = 2 * n + 1

    for i in range(m, n, 2):
        result += prime(i)

    print(result)