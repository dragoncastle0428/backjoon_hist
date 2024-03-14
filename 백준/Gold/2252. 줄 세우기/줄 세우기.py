import sys
from collections import deque

#int 자료형 2개 입력
n, m = map(int, sys.stdin.readline().split())

graph = [[] for _ in range(n+1)] #자신보다 큰 숫자와 연결 (한방향)
degree = [0 for _ in range(n+1)] #자신보다 작은 숫자의 갯수
list = [] #자신보다 작은 수가 없는 경우 (degree = 0)
anw = [] #최종 출력하는 리스트

for i in range(m):
    num1, num2 = map(int, sys.stdin.readline().split())
    graph[num1].append(num2)
    degree[num2] += 1

for i in range(1, n+1):
    if (degree[i] == 0):
        list.append(i)

for i in list:
    anw.append(i);
    for j in graph[i]:
        degree[j] -= 1
        if (degree[j] == 0):
            list.append(j)

#리스트 값들을 한번에 출력
print(*anw)
