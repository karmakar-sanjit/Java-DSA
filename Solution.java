import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int[] nums = new int[len];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nums));
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == 1) {
                currentCount++;
                if(maxCount < currentCount) {
                    maxCount = currentCount;
                }
            }
            else {
                currentCount = 0;
            }
        }
        return maxCount;
    }
}