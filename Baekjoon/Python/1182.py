from itertools import combinations

N, S = map(int, input().split())
src = list(map(int, input().split()))
count = 0

for i in range(1, int(N)+1):
    for j in combinations(src, i):
        if sum(j) == S:
            count += 1
print(count)
