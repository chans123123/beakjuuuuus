num = int(input())

ans, sum, top_pointer, bot_pointer = 1, 1, 1, 1 # count, total, end, start

while top_pointer != num:
    if sum == num:
        ans += 1
        top_pointer += 1
        sum += top_pointer

    elif sum > num:
        sum -= bot_pointer
        bot_pointer += 1
    
    elif sum < num:
        top_pointer += 1
        sum += top_pointer

print(ans)
