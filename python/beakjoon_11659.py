import sys
input = sys.stdin.readline
n, m = map(int, input().split())

A_list = list(map(int, input().split()))
S_list = [0]

temp = 0
for i in A_list:
    temp += i
    S_list.append(temp)

for i in range(m):
    i, j = map(int, input().split())
    print(S_list[j] - S_list[i-1])
