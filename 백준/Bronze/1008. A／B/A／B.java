import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 정밀한 계산을 위해 double형으로 입력을 받습니다.
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        
        // 나눗셈 결과 출력
        System.out.println(A / B);
        
        sc.close();
    }
}