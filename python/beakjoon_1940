n = int(input())
m = int(input())
item = list(map(int, input().split()))

item.sort() # 1, 2, 3, 4, 5, 7 
cnt = 0
a = 0
b = n-1

while a < b:
    total = item[a] + item[b]
    if total == m:
        cnt += 1
        a += 1
        b += 1
    
    if total < m:
        a += 1
    
    else:
        b -= 1

print(cnt)
