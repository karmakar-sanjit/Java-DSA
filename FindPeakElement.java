import java.util.Arrays;
import java.util.Scanner;

public class FindPeakElement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int len = sc.nextInt();

        int[] nums = new int[len];
        for(int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nums));
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }

    public static int findPeakElement(int[] nums) {
        int position = 0;
        int ans = nums[0];
        for(int i = 0; i < nums.length ; i++){

            if(nums[i] >= ans){
                ans = nums[i];
                position = i;
            }
        }
        return position;
    }
}
