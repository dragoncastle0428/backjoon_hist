import sys
n = int(sys.stdin.readline())
left = {}

for i in range(n):
    name, status = sys.stdin.readline().split()
    if status == "enter":
        left[name] = 1
    else:
        left.pop(name)

left = sorted(list(left), reverse=True)

for i in left:
    print(i)