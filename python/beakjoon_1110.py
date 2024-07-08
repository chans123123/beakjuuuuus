import sys
input = sys.stdin.readline

n = int(input()) #26
num = n
cnt = 0

while True:
    a = num // 10 #2
    b = num % 10  #6
    c = (a + b) % 10   #8
    num = (b*10) + c
    cnt += 1
    
    if n == num:
        break

print(cnt)
