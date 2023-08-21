import java.util.Scanner;

public class ShuffleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int[] indices = new int[len];

        for(int i = 0; i < indices.length; i++) {
            indices[i] = sc.nextInt();
        }
        String a = restoreString(s, indices);
        System.out.println(a);
    }

    public static String restoreString(String s, int[] indices) {
        char[] ch = s.toCharArray();
        char[] res = new char[s.length()];
        for(int i = 0, j = 0; i < res.length & j < res.length; i++, j++) {
            res[indices[i]] = ch[i];
        }
        String ans = new String(res);
        return ans;
    }
}
