import java.util.Scanner;

public class NumberOfPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0 ; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        System.out.println(computePairs(arr, target, 0, count));
    }

    public static int computePairs(int[] arr, int target, int index, int count) {
        if(index == arr.length) {
            return count;
        }
        for(int i = index + 1; i < arr.length; i ++) {
            if(arr[index] > arr[i]) {
                if(arr[index] - arr[i] == target) {
                    count++;
                }
            }
            else {
                if(arr[i] - arr[index] == target) {
                    count++;
                }
            }
        }
        return computePairs(arr, target, index + 1, count);
    }
}
