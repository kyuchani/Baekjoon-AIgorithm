import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 정수 A, B 입력
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // 곱셈 결과 출력
        System.out.println(A * B);
        
        sc.close();
    }
}