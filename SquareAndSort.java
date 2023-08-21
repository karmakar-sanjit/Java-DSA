import java.util.Arrays;
import java.util.Scanner;

public class SquareAndSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int []nums = new int[len];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nums));
        sortedSquares(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if(nums[j] < nums[j-1]) {
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}

