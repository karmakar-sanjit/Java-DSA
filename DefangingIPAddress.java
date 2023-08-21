import java.util.Scanner;

public class DefangingIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String address = sc.next();
        String ans = defangIPaddr(address);
        System.out.println(ans);
    }

    public static String defangIPaddr(String address) {
        int len = address.length();
        char[] chn = new char[len + 6];
        char[] ch = address.toCharArray();
        Character cht = new Character('.');
        for(int i = 0, j = 0; i < len && j < len + 6; i++, j++) {
            if(ch[i] == cht) {
                chn[j] = '[';
                chn[j + 1] = '.';
                chn[j + 2] = ']';
                j = j + 2;
            }
            else {
               chn[j] = ch[i];
            }
        }
        String result = new String(chn);
        return result;
    }
}
