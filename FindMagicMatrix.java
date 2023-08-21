import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindMagicMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] nums = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++)
                nums[i][j] = sc.nextInt();
        }

        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(" ");
        }

        int[][] ans = magicMatrix(nums);

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static int sqNumber(int num) {
        int sqNum = 0;
        while(num > 0) {
            int rem = num % 10;
            sqNum = sqNum + (rem * rem);
            num = num/10;
        }
        return sqNum;
    }

    public static boolean isMagicNumber(int num) {
        int result = num;
        while(result != 1 && result != 4) {
            result = sqNumber(result);
        }
        if(result == 1){
            return true;
        }
        return false;
    }

    public static int[][] magicMatrix(int[][] matrix) {
        int[][] ans = new int[3][3];

        int maxCount = 0;
        for(int l = 0; l < matrix.length - 2; l++) {
            for(int k = 0; k < matrix[l].length - 2; k++) {
                int magicNoCount = 0;
                for(int i = l; i < 3 + l; i++) {
                    for(int j = k; j < 3 + k; j++) {
                        if(isMagicNumber(matrix[i][j])) {
                            magicNoCount++;
                        }
                    }
                }
                if( maxCount < magicNoCount) {
                    maxCount = magicNoCount;
                    for(int i = l; i < 3 + l; i++) {
                        for(int j = k; j < 3 + k; j++) {
                            ans[i - l][j - k] = matrix[i][j];
                        }
                    }
                }


            }
        }
        return ans;
    }
}
