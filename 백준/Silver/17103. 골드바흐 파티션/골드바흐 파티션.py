import sys

prime = [True for _ in range(1000001)]
prime[0] = prime[1] = False
for i in range(2, 1001):
    if prime[i]:
        for j in range(i*i, 1000001, i):
            prime[j] = False

n = int(sys.stdin.readline())

for i in range(n):
    count = 0
    num = int(sys.stdin.readline())
    if num == 4:
        print(1)
        continue

    for j in range(3, int(num/2)+1, 2):
        if prime[j] and prime[num-j]:
            count += 1

    print(count)