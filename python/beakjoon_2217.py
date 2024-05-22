import sys
input = sys.stdin.readline

n = int(input())
weight = []

for _ in range(n):
    max_weight = int(input())
    weight.append(max_weight)
weight.sort()

result = []
for i in weight:
    result.append(i * n)
    n -= 1

print(max(result))
