N, M = map(int, input().split())

A = [list(map(int, input().split())) for _ in range(N)]

for i in range(N):
    B_row = list(map(int, input().split()))
    
    for j in range(M):
        print(A[i][j] + B_row[j], end=" ")
    print()