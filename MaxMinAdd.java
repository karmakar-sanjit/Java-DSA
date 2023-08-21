import java.util.*;

public class MaxMinAdd {
    public static void main(String[] args) {
        int[] A = {8, 9, 6, 7, 2, 1, 4};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        Arrays.sort(A);
        int max = A[A.length -1];
        int min = A[0];
        return max + min;
    }
}
