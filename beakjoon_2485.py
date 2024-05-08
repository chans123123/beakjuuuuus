import sys
from math import gcd
N = int(sys.stdin.readline())
tree = []

for _ in range(N):
    tree.append(int(sys.stdin.readline()))

arr = []

for i in range(N-1):
    arr.append(tree[i+1] - tree[i])

g = arr[0]
for j in range(1, len(arr)):
    g = gcd(g, arr[j])  

result = 0
for each in arr:
    result += each // g - 1
print(result)
