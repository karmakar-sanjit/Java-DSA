import java.util.Scanner;

public class SubSequence  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String up = sc.next();
        subseq("", up);
    }

    public static void subseq(String p, String up) {
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }
}
