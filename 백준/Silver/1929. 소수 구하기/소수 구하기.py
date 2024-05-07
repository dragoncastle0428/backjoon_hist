from math import*
import sys

def prime(num):
    if num<=1:
        return False
    if num==2:
        return True
    if num%2==0:
        return False
    for i in range(3,int(sqrt(num))+1,2):
        if num%i==0:
            return False
    return True

m,n = map(int, sys.stdin.readline().split())
for i in range(m,n+1): 
    if prime(i)==True:
        print(i)