import java.util.*;
import java.util.Scanner;

public class OccuranceOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int[] arr = occurance(input);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] occurance(String input) {
        char[] ch = input.toCharArray();
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            char c = (char)i;
            for(int j = 0; j < ch.length; j++) {
                if(Character.getNumericValue(ch[j]) == i) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}
