import sys

list_left = list(sys.stdin.readline().rstrip())
list_right = [ ]

N = int(sys.stdin.readline())

for _ in range(N):
    command = sys.stdin.readline().split()
    
    if command[0] == "L" and len(list_left) > 0:
        list_right.append(list_left.pop())

    if command[0] == "D" and len(list_right) > 0:
        list_left.append(list_right.pop())
    
    if command[0] == "B" and len(list_left) > 0:
        list_left.pop()

    if command[0] == "P":
        list_left.append(command[1])
                
print("".join(list_left + list(reversed(list_right))))
