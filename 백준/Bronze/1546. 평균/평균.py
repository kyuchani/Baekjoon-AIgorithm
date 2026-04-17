N = int(input())

scores = list(map(int, input().split()))

max_score = max(scores)
total_sum = sum(scores)

new_avg = (total_sum * 100) / (max_score * N)

print(new_avg)