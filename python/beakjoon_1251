word = list(input())
array_list = [ ]
answer = [ ]

for i in range(1, len(word)-1):
    for j in range(i+1, len(word)):
        a = word[:i]
        b = word[i:j]
        c = word[j:]
        
        a.reverse()
        b.reverse()
        c.reverse()
           
        array_list.append(a + b + c)       

for i in array_list:
    answer.append("".join(i))

print(sorted(answer)[0]) 
