import sys

n = int(sys.stdin.readline())
queue = [0 for _ in range(n)]
front = n-1
end = n-1
size = 0

for i in range(n):
    ls = list(sys.stdin.readline().split())

    if ls[0] == '1':
        front = (front + n - 1) % n
        queue[(front+1)%n] = int(ls[1])
        size += 1
    elif ls[0] == '2':
        end = (end + 1) % n
        queue[end] = int(ls[1])
        size += 1
    elif ls[0] == '6':
        if front == end:
            print(1)
        else:
            print(0)
    elif ls[0] == '5':
        print(size)
    elif front == end:
        print(-1)
    elif ls[0] == '3':
        front = (front + 1) % n
        print(queue[front])
        size -= 1
    elif ls[0] == '4':
        print(queue[end])
        end = (end + n - 1) % n
        size -= 1
    elif ls[0] == '7':
        print(queue[(front+1)%n])
    else:
        print(queue[end])