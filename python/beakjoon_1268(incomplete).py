n = int(input()) 
st_ban = []

for _ in range(n):
    st_ban.append(list(map(int, input().split())))

cnt_list = [[0 for _ in range(n)] for _ in range(n)]

for i in range(5):
    for j in range(n):
        for k in range(j+1, n):
            if st_ban[j][i] == st_ban[k][i]:
                cnt_list[j][i] = 1
                cnt_list[k][i] = 1
cnt = []
for s in cnt_list:
    print(s)

for c in cnt_list:
    cnt.append(c.count(1))
print(cnt.index(max(cnt))+1)
