import sys

listx_y = []
N = int(sys.stdin.readline())

for _ in range(N):
    x, y = map(int, sys.stdin.readline().split())
    listx_y.append((x, y))

listx_y.sort(key = lambda x: (x[1], x[0]))

for i in listx_y:
    print(i[0], i[1])
