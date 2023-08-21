import java.util.Scanner;

public class PangramChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace(" ", "");
        str = str.toUpperCase();

        char[] sen = str.toCharArray();

        int[] index = new int[26];
        for(int i =0; i < index.length; i++) {
            index[i] = 0;
        }

        int i = 0;
        while(i != sen.length) {
            index[sen[i] - 65] = 1;
            i++;
        }

        int j = 0;
        while(j != index.length) {
            if(index[j] == 1) {
                j++;
            }
            else{
                System.out.println("Not Pangram");
                System.exit(0);
            }
        }
        System.out.println("Pangram");
    }
}
