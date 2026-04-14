import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static int L, C;
    static char[] chars;
    static char[] pwd;

    static boolean isValid() {
        int v = 0, c = 0;
        for (int i = 0; i < L; i++) {
            if (pwd[i] == 'a' || pwd[i] == 'e' || pwd[i] == 'i' || pwd[i] == 'o' || pwd[i] == 'u') v++;
            else c++;
        }
        return v >= 1 && c >= 2;
    }

    static void dfs(int depth, int idx) {
        if (depth == L) {
            if (isValid()) {
               System.out.println(new String(pwd)); 
            }
            return;
        }
        
        for (int i = idx; i < C; i++) {
            pwd[depth] = chars[i];
            dfs(depth + 1, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();
        C = sc.nextInt();
        chars = new char[C];
        pwd = new char[L];

        for (int i = 0; i < C; i++) {
            chars[i] = sc.next().charAt(0);
        }

        Arrays.sort(chars);
        
        dfs(0, 0);
        sc.close();
    }
}