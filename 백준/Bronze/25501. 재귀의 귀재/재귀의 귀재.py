import sys

def recursion(s, l, r, c):
    c += 1
    if l >= r:
        return 1, c
    elif s[l] != s[r]:
        return 0, c
    else:
        return recursion(s, l+1, r-1, c)

def isPalindrome(s):
    return recursion(s, 0, len(s)-1, 0)

n = int(sys.stdin.readline())

for i in range(n):
    s = sys.stdin.readline().rstrip()
    print(*isPalindrome(s))