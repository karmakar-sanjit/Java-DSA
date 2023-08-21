import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int ans = 0;
        int base = 5;
        while(n > 0) {
            int last = n & 1;
            ans = ans + last * base;
            n = n >> 1;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
