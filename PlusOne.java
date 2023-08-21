import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int len = sc.nextInt();

        int[] digits = new int[len];
        for(int i = 0; i < len; i++) {
            digits[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(digits));
        int[] ans = plusOne(digits);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] plusOne(int[] digits) {
        long original = 0;
        for(int i = digits.length - 1; i >= 0; i--) {
            original = original + (long) (digits[i] * (Math.pow(10, digits.length - 1 -i)));
        }
        long newNum = original + 1;
        long num = newNum;
        int count = 0;
        while(num > 0) {
            num = num/10;
            count++;
        }


        int[] ans = new int[count];
        int i = count - 1;
        while(newNum > 0 || i >= 0) {
            int rem = (int)(newNum % 10);
            ans[i] = rem;
            newNum = newNum/10;
            i--;
        }
        return ans;
    }
}
