import java.util.Arrays;
import java.util.Scanner;

public class CheckingVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] ans = noOfVowels(str);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] noOfVowels(String str) {
        int vowelCount = 0;
        int consonentCount = 0;
        int specialChar = 0;
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        int i = 0;
        while(i != ch.length) {
            if((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122)) {
                if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                    ++vowelCount;
                }
                else {
                    ++consonentCount;
                }
            }
            else {
                ++specialChar;
            }
            i++;
        }
        int[] count = {vowelCount, consonentCount, specialChar};
        return count;
    }

}
