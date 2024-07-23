import sys

T = int(sys.stdin.readline())

for _ in range(T):
    N = int(sys.stdin.readline())
    num = [0] * (N+1)
    
    for i in range(1, N+1):
        if i == 1:
            num[i] = 1
        elif i == 2:
            num[i] = 2
        elif i == 3:
            num[i] = 4
        else:
            num[i] = num[i-1] + num[i-2] + num[i-3]

    print(num[N])
