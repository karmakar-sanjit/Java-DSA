import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int window = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(subArrayAddOptimize(arr, window));
    }

    public static int subArrayAdd(int[] arr, int window) {
        int max = 0;
        for(int i = 0; i < arr.length - window + 1; i++) {
            int current = 0;
            for(int j = i; j < i + window; j++) {
                current = current + arr[j];
            }
            if(current > max) {
                max = current;
            }
        }
        return max;
    }

    public static double subArrayAddOptimize(int[] arr, int window) {
        double current = 0;
        for(int i = 0; i < window; i++){
            current = current + arr[i];
        }
        double max = current;
        for(int i = window; i < arr.length; i++) {
            current = current + arr[i] - arr[i - window];
            max = Math.max(current, max);
        }
        return max/(double)(window);
    }
}

//https://knome.ultimatix.net/blogposts/812152