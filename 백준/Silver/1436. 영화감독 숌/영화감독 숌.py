import sys

n = (int)(sys.stdin.readline())

count = 1
num = 666
while count < n:
    num += 1
    if str(num).__contains__("666"):
        count += 1

print(num)