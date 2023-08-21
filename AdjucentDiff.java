import java.util.Scanner;

public class AdjucentDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int []nums = new int[len];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int place = sc.nextInt();
        System.out.println(diff(nums, place));
    }

    public static int diff(int[] nums, int place) {
        int firstDiff = Math.abs(nums[place] - nums[place - 1]);
        int secondDiff = Math.abs(nums[place] - nums[place + 1]);
        return firstDiff + secondDiff;
    }
}
