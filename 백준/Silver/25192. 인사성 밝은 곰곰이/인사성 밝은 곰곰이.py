import sys

n = int(sys.stdin.readline())
l = {}
enter = sys.stdin.readline().strip()
count = 0

for i in range(n-1):
    name = sys.stdin.readline().strip()
    if name == "ENTER":
        l = {}
    elif name not in l:
        l[name] = True
        count += 1

print(count)