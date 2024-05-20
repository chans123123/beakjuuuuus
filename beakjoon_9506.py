while True:
    n = int(input())
    list = [ ]
    
    if n == -1:
        break
    for i in range(1, n):
        if n % i == 0:
            list.append(i)
    if sum(list) == n:
        print(n, " = ", " + ".join(str(i) for i in list), sep="")
    else:
        print(n, "is NOT perfect.")      
