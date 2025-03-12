def colourHouse(numH):
    memo = [[0, 0, 0] for _ in range(numH)]

    memo[0][0] = colourCost[0][0]
    memo[0][1] = colourCost[0][1]
    memo[0][2] = colourCost[0][2]

    for i in range(1, numH):
        memo[i][0] = colourCost[i][0] + min(memo[i-1][1], memo[i-1][2])
        memo[i][1] = colourCost[i][1] + min(memo[i-1][0], memo[i-1][2])
        memo[i][2] = colourCost[i][2] + min(memo[i-1][0], memo[i-1][1])
    
    return min(memo[numH-1][0], memo[numH-1][1], memo[numH-1][2])


numH = int(input())
colourCost = [[0, 0, 0] for _ in range(numH)]

for i in range(numH):
    colourCost[i] = list(map(int, input().split()))

print(colourHouse(numH))