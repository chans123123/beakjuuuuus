import sys

N = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline())
arr2 = list(map(int, sys.stdin.readline().split()))

dic = { }

for card in arr:
    if card in dic:
        dic[card] += 1
    else:
        dic[card] = 1

for card2 in arr2:
    if card2 in dic:
        print(dic[card2], end = ' ')
    else:
        print(0, end = ' ')