import math

def sieve_of_eratosthenes(max_limit):
    prime = [True for _ in range(max_limit+1)]
    prime[0] = prime[1] = False
    for i in range(2, int(math.sqrt(max_limit)) + 1):
        if prime[i]:
            for j in range(i*i, max_limit+1, i):
                prime[j] = False
    return prime

def count_primes_in_range(n, prime):
    count = 0
    for i in range(n+1, 2*n+1):
        if prime[i]:
            count += 1
    return count

# 범위 내의 최대 값으로 에라토스테네스의 체를 한 번만 생성
max_limit = 123456 * 2
prime = sieve_of_eratosthenes(max_limit)

while True:
    n = int(input())
    if n == 0:
        break
    print(count_primes_in_range(n, prime))