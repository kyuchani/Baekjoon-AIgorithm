# x와 y 값을 각각 한 줄씩 입력받음
x = int(input())
y = int(input())

# 사분면 판별 로직
if x > 0 and y > 0:
    print(1)
elif x < 0 and y > 0:
    print(2)
elif x < 0 and y < 0:
    print(3)
else:
    # 위의 세 조건에 모두 해당하지 않으면 (즉, x > 0 이고 y < 0 이면) 제4사분면
    print(4)