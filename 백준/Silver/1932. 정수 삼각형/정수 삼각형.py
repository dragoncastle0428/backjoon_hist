num = int(input())
a = []

for i in range(num):
    a.extend(list(map(int, input().split())))

sumA = [0 for _ in range(len(a))]
sumA[0] = a[0]

depth = 1
count = 0
for i in range(0, len(sumA) - num):
    count += 1
    if sumA[i + depth] < sumA[i] + a[i + depth]: sumA[i + depth] = sumA[i] + a[i + depth]
    if sumA[i + depth+1] < sumA[i] + a[i + depth+1]: sumA[i + depth+1] = sumA[i] + a[i + depth+1]
    if count == depth: 
        count = 0
        depth += 1

print(max(sumA[len(sumA)-num:]))