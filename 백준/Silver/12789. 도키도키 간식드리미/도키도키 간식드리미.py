import sys

n = int(sys.stdin.readline())

check = True
stack = []
ls = list(map(int, sys.stdin.readline().split()))
num = 1
for i in ls:
    if i != num:
        stack.append(i)
    else:
        num += 1
        while True:
            if len(stack) == 0:
                break
                
            top = stack.pop()
            if top != num:
                stack.append(top)
                break
            else:
                num += 1

stack = reversed(stack)

for i in stack:
    if i != num:
        print("Sad")
        check = False
        break
    else:
        num += 1

if check:
    print("Nice")