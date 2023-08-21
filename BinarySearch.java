import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int []arr = new int[len];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int terget = sc.nextInt();

        System.out.println(Arrays.toString(arr));
        int ans = search(arr, terget);
        System.out.println(ans);
    }

    public static int search(int[] arr, int terget) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == terget){
                return mid + 1;
            } else if(arr[mid] < terget) {
                start = mid + 1;
            } else{
                end = mid;
            }
        }
        return -1;
    }
}
