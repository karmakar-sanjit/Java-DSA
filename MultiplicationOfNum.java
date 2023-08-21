import java.util.Scanner;

public class MultiplicationOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 1;
        int result = multiplication(num, ans);
        System.out.println(result);
    }

    public static int multiplication(int num, int ans) {
        if(num == 0) {
            return ans;
        }
        int rem = num % 10;
        ans = ans * rem;
        return multiplication(num/10, ans);
    }
}
