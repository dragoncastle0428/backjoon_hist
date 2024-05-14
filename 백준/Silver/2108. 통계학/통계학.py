import sys
from collections import Counter

n = int(sys.stdin.readline())
l = []

for i in range(n):
    l.append(int(sys.stdin.readline()))

l.sort()
print(round(sum(l)/n))
print(l[int(n/2)])
count = Counter(l)
counter = count.most_common(2)
if n > 1:
    if counter[0][1] == counter[1][1]:
        print(counter[1][0])
    else:
        print(counter[0][0])
else:
    print(l[0])
print(l[n-1] - l[0])