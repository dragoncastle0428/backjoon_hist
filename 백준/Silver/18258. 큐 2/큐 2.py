import sys

n = int(sys.stdin.readline())
queue = [0 for _ in range(n)]
front = -1
end = -1

for i in range(n):
    ls = list(sys.stdin.readline().split())

    if ls[0] == 'push':
        end += 1
        queue[end] = int(ls[1])
    elif ls[0] == 'empty':
        if front == end:
            print(1)
        else:
            print(0)
    elif ls[0] == 'size':
        print(end-front)
    elif front == end:
        print(-1)
    elif ls[0] == 'pop':
        front += 1
        print(queue[front])
    elif ls[0] == 'front':
        print(queue[front+1])
    else:
        print(queue[end])