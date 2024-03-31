import sys

a, b, c, d, e, f = map(float, sys.stdin.readline().split())

if d == 0:
    y = round((f - c * (d / a)) / (e - b * (d / a)))
    x = round((c - b * y) / a)
else:
    if a == 0:
        y = round((c - f * (a / d)) / (b - e * (a / d)))
        x = round((f - e * y) / d)
    else:
        y = round((c - f * (a / d)) / (b - e * (a / d)))
        x = round((c - b * y) / a)

print(x, y)