import java.util.Scanner;

public class SubstringDCAProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = addOfSubstring(str);
        System.out.println(result);
    }

    private static int addOfSubstring(String str) {
        int total = 0;
        for(int i = 0; i <= str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                total = total + Integer.parseInt(sub);
            }
        }
        return total;
    }

}
