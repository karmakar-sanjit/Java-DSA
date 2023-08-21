import java.util.*;
public class SubArrayGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = subarraySum(arr, n, s);
        System.out.println(result);
    }


    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> position = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            int total = 0;
            for(int j = i; j < arr.length; j++) {
                total = total + arr[j];
                if(s < total) {
                    break;
                }
                if(total == s) {
                    position.add(i+1);
                    position.add(j+1);
                    return position;
                }
            }
        }
        position.add(-1);
        return position;
    }
}
