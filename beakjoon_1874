import sys

N = int(sys.stdin.readline())

cnt = 1
stack = []
oper = []
possible = True

for _ in range(N):
    num = int(sys.stdin.readline())
    while cnt <= num:
        stack.append(cnt)
        oper.append("+")
        cnt += 1

    if num == stack[-1]:
        stack.pop()
        oper.append("-")
    else:
        possible = False
        
if not possible:
    print("No")    

else:
    for i in oper:
        print(i)
