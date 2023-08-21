import java.util.Scanner;

public class StringAppendChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(checkingNum(input));
    }

    public static String checkingNum(String input) {
        String ans = "No";
        char[] inputChar = input.toCharArray();
        if(inputChar.length - 1 == Character.getNumericValue(inputChar[inputChar.length - 1])) {
            return "Yes";
        }
        return ans;
    }
}
