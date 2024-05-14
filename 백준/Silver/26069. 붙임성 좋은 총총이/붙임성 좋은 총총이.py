import sys

n = int(sys.stdin.readline())
l = {"ChongChong": True}
count = 1

for i in range(n):
    name1, name2 = sys.stdin.readline().strip().split()
    if name1 not in l and name2 in l:
        l[name1] = True
        count += 1
    elif name2 not in l and name1 in l:
        l[name2] = True
        count += 1

print(count)