import sys

n = int(sys.stdin.readline())
a = []

for i in range(n):
    temp = sys.stdin.readline()
    if temp not in a:
        a.append(temp)

a.sort(key=lambda x: ((len(x)), x))

for i in a:
    print("".join(i), end='')