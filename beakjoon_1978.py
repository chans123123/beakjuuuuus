import sys
 
N = int(sys.stdin.readline())
integer = list(map(int, sys.stdin.readline().split())) 
count = 0

for i in integer: 
    for j in range(2, i+1): 
        if i % j== 0:
            if j == i:
                count += 1
            else:
                break

print(count)
