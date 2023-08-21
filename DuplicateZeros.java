import java.util.Arrays;
import java.util.Scanner;

public class DuplicateZeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int []nums = new int[len];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nums));
        duplicateZerosCount(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void duplicateZerosCount(int[] arr) {
        int[] nums = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                for(int j = arr.length -1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
                arr[i] = 0;
                i = i+1;
            }
        }
    }
}
