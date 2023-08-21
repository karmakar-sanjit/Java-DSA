import java.util.*;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.next();
        System.out.println(replace(original));
    }

    public static String replace(String original) {
        String result = "";
        for(int i = 0; i < original.length(); i++) {
            if(original.charAt(i) == 'e') {
                result = result + 'i';
            }
            else {
                result = result + original.charAt(i);
            }
        }
        return result;
    }
}
