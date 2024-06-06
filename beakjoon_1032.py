import sys
input = sys.stdin.readline

n = int(input())
sentence = list(input())

for i in range(n-1):
      other_sen = input()
    for j in range(len(sentence)):
        if sentence[j] != other_sen[j]:
            sentence[j] = "?"

for i in sentence:
    print(i, end="")
