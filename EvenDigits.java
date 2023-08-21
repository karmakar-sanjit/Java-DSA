import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf(num + ": " );
        System.out.println(count(num));
    }

    public static int count(int num) {
        int count = 1;
        while(num/10 != 0) {
            num = num/10;
            count++;
        }
        return count;
    }
}
