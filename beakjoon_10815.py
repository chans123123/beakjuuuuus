import sys

N = int(sys.stdin.readline())
card_cn = list(map(int, sys.stdin.readline().split()))

M = int(sys.stdin.readline())
card_num = list(map(int, sys.stdin.readline().split()))

dic = {}

for i in card_num:
    dic[i] = 0

for j in card_cn:
    if j in dic:
        dic[j] += 1

for k in dic:
    print(dic[k], end=' ')