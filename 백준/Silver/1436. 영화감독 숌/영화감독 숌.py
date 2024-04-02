import sys

n = (int)(sys.stdin.readline())

count = 1
num = 666
while count < n:
    num += 1
    if "666" in str(num): #contain 보다 좋은 방식
        count += 1

print(num)
