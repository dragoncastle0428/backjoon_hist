import sys

m = int(sys.stdin.readline())
data = set()

for i in range(m):
    input = sys.stdin.readline().split()
    if input[0] == "add":
        data.add(int(input[1]))
    elif input[0] == "remove":
        if int(input[1]) in data:
            data.remove(int(input[1]))
    elif input[0] == "check":
        if int(input[1]) in data:
            print(1)
        else:
            print(0)
    elif input[0] == "toggle":
        if int(input[1]) in data:
            data.remove(int(input[1]))
        else:
            data.add(int(input[1]))
    elif input[0] == "all":
        data = set([i for i in range(1, 21)])
    else:
        data = set()