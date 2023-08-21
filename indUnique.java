import java.util.Scanner;

public class indUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int []nums = new int[len];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(ans(nums));
    }

    public static int ans(int[] nums) {
        int unique = 0;
        for(int i = 0; i< nums.length; i++) {
            unique = unique ^ nums[i];
        }
        return unique;
    }
}
