import java.util.Scanner;

public class RemoveFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String res = formatString(input);
        System.out.println(res);
    }

    public static String formatString(String input) {
        String ans = "";
        char[] charInput = input.toCharArray();
        int i = 0;
        while(i != charInput.length) {
            if(charInput[i] == '7'){
                charInput[i] = ' ';
            }
            else  if(i + 1 != charInput.length) {
                if (charInput[i] == '5' && charInput[i + 1] == '6') {
                    charInput[i] = ' ';
                    charInput[i + 1] = ' ';
                    i++;
                }
            }
            i++;
        }

        for(int j = 0; j < charInput.length; j++) {
            if(charInput[j] != ' ') {
                ans = ans + charInput[j];
            }
        };
        return ans;
    }
}
