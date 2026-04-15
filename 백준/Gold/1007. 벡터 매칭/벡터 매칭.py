import sys
import math
from itertools import combinations

def solve():
    input = sys.stdin.readline
    T = int(input())
    
    for _ in range(T):
        N = int(input())
        points = [tuple(map(int, input().split())) for _ in range(N)]
        
        # 모든 점의 총합
        total_x = sum(p[0] for p in points)
        total_y = sum(p[1] for p in points)
        
        min_ans = float('inf')
        
        # 첫 번째 점은 무조건 '도착점(더해지는 점)'으로 고정하여 연산량 절반으로 감소
        first = points[0]
        rest_points = points[1:]
        
        # 나머지 N-1개의 점 중에서 N/2 - 1개의 점을 뽑는 조합
        for comb in combinations(rest_points, N // 2 - 1):
            sum_x = first[0]
            sum_y = first[1]
            
            for px, py in comb:
                sum_x += px
                sum_y += py
            
            # 수식 적용: 2 * (선택된 점들의 합) - (전체 점의 합)
            dx = 2 * sum_x - total_x
            dy = 2 * sum_y - total_y
            
            # 벡터의 길이 계산
            length = math.hypot(dx, dy)
            if length < min_ans:
                min_ans = length
                
        # 소수점 아래 6자리 이상 출력
        print(f"{min_ans:.7f}")

if __name__ == '__main__':
    solve()