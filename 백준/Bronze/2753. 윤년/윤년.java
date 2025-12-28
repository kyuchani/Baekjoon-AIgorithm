import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        sc.close();

        // 4의 배수여야 함 (year % 4 == 0)
        // 그러면서 100의 배수가 아니거나 (year % 100 != 0)
        // 또는 400의 배수여야 함 (year % 400 == 0)
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}