import sys
from collections import deque

n = int(sys.stdin.readline())
ls = deque(enumerate(map(int, sys.stdin.readline().split())))

for i in range(n):
    idx, tmp = ls.popleft()
    print(idx + 1, end= ' ')
    if tmp > 0:
        ls.rotate(-(tmp - 1))
    else:
        ls.rotate(-tmp)