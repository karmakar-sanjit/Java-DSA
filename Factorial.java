import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = 1;
        if(N == 0) {
            System.out.println("1");
        }
        for(int i=1; i<=N; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}