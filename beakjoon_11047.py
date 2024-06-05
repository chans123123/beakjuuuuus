import sys
input = sys.stdin.readline

n, k = map(int,input().split())
coin_list = []
cnt = 0

for _ in range(n):
    coin = int(input())
    coin_list.append(coin)

coin_list.sort(reverse=True)
for i in range(len(coin_list)):
    cnt += k // coin_list[i]
    k %= coin_list[i]

print(cnt)
