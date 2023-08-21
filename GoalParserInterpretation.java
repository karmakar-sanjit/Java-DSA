import java.util.Scanner;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.next();
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        String result = "";
        char[] ch = command.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == '(' && ch[i + 1] == ')') {
                result = result + "o";
                i = i + 1;
            }
            else if(ch[i] == '(' && ch[i + 1] == 'a' ) {
                result = result + "al";
                i = i + 3;
            }
            else {
                result = result + ch[i];
            }
        }
        return result;
    }
}
