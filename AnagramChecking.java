import java.util.*;

public class AnagramChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 =str1.replace(" ","");
        str2= str2.replace(" ","");
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] stream1 = str1.toCharArray();
        Arrays.sort(stream1);

        char[] stream2 = str2.toCharArray();
        Arrays.sort(stream2);

        if(Arrays.equals(stream1, stream2)) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not an Anagram");
        }
    }
}
