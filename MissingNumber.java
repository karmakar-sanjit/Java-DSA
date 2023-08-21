import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int []arr = new int[len];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(missingNum(arr));
    }

    public static int missingNum(int[] arr) {
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            int current = i + 1;
            if(arr[i] != current) {
                return current;
            }
        }
        return arr.length + 1;
    }
}
