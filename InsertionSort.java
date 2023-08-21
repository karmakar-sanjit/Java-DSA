import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int []arr = new int[len];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int []arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1; j > 0; j--) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
