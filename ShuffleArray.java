import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int []nums = new int[len];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        System.out.println(Arrays.toString(nums));
        int[] ans = new int[len];
        ans = shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n * 2];
        int j = 0;
        int k = n;
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                while(j < n){
                    ans[i] = nums[j];
                    j++;
                    break;
                }
            } else {
                while(k < nums.length) {
                    ans[i] = nums[k];
                    k++;
                    break;
                }
            }
        }
        return ans;
    }
}
