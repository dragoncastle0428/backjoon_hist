import sys
input = sys.stdin.readline

def cut(start, n):
    if n == 1: return
    for i in range(start + n//3, start + (n//3)*2):
        result[i] = ' '
    cut(start, n//3) # 왼쪽
    cut(start + (n//3) * 2, n //3) # 오른쪽

while 1:
    try:
        n = int(input())
        result = ['-']*(3**n)
        cut(0, 3**n)
        print(''.join(result))
    except: break