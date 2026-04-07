numbers = []

for _ in range(9):
    numbers.append(int(input()))

max_val = max(numbers)

max_idx = numbers.index(max_val) + 1

print(max_val)
print(max_idx)