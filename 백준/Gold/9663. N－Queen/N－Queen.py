import sys

def check(col, row, rowA):
    for i in range(len(rowA)):
        if row == rowA[i]:
            return False
        elif abs(col - i) == abs(row - rowA[i]):
            return False
    return True

def function(num, row, count):
    if count == num:
        return 1
    else:
        total = 0
        for i in range(num):
            if check(count, i, row):
                total += function(num, row + [i], count+1)
        return total

n = int(sys.stdin.readline())
print(function(n, [], 0))