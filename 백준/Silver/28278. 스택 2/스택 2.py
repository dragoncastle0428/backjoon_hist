import sys
n = int(sys.stdin.readline())
stack = []
top = -1

for i in range(n):
    num = list(map(int, sys.stdin.readline().split()))
    fun = num[0]
    if fun == 1:
        top += 1
        stack.append(num[1])
    elif fun == 2:
        if top == -1:
            print(-1)
        else:
            print(stack.pop())
            top -= 1
    elif fun == 3:
        print(top+1)
    elif fun == 4:
        if top == -1:
            print(1)
        else:
            print(0)
    elif fun == 5:
        if top == -1:
            print(-1)
        else:
            print(stack[top])