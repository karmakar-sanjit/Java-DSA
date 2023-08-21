import java.util.Scanner;

public class DiffEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int []nums = new int[len];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(diff(nums));
    }

    public static int diff(int[] nums) {
        int evenSum = nums[0];
        int oddSum = 0;
        for(int i = 1; i < nums.length; i++) {
            if(i % 2 == 0) {
                evenSum = evenSum + nums[i];
            }
            else {
                oddSum = oddSum + nums[i];
            }
        }
        int diff = 0;
        if(oddSum > evenSum) {
            diff = oddSum - evenSum;
        }
        else {
            diff = evenSum - oddSum;
        }
        return diff;
    }
}
