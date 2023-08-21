import java.util.Scanner;

public class CreatingUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String emailId = sc.next();
        System.out.println(username(emailId));
    }

    public static String username(String emailId) {
        int pos = 0;
        for(int i = 0; i < emailId.length(); i++) {
            if(emailId.charAt(i) == '@'){
                pos = i;
            }
        }
        String username = emailId.substring(0, pos);
        return username;
    }
}
