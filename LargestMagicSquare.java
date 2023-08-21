import java.util.Scanner;

public class LargestMagicSquare {
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

        System.out.println(magicMatrix(nums));
    }


    public static boolean matrixSum(int[][] subMatrix) {
        int priDiaSum = 0;
        int secDiaSum = 0;

        for(int i = 0; i < subMatrix.length; i++) {
            for(int j = 0; j < subMatrix[i].length; j++) {
                if(subMatrix[i][j] > 9 || subMatrix[i][j] <= 0) {
                    return false;
                }
            }
        }

        int[] ithRowSum = new int[subMatrix.length];
        int[] ithColSum = new int[subMatrix.length];
        for(int i = 0; i < subMatrix.length; i++) {
            for(int j = 0; j < subMatrix[i].length; j++) {
                ithRowSum[i] = ithRowSum[i] + subMatrix[i][j];
                ithColSum[i] = ithColSum[i] + subMatrix[j][i];
                if(i == j) {
                    priDiaSum = priDiaSum + subMatrix[i][j];
                }
                if(i + j == subMatrix.length - 1) {
                    secDiaSum = secDiaSum + subMatrix[i][subMatrix.length - 1 - i];
                }
            }
        }

        for(int i = 0; i < ithRowSum.length; i++){
            if(ithRowSum[i] % ithRowSum[0] != 0) {
                return false;
            }
        }

        for(int i = 0; i < ithColSum.length; i++){
            if(ithColSum[i] % ithColSum[0] != 0) {
                return false;
            }
        }


        if(priDiaSum != secDiaSum) {
            return false;
        }

        if(ithRowSum[0] == ithColSum[0] && ithColSum[0] == priDiaSum) {
            return true;
        }
        return false;
    }

    public static int magicMatrix(int[][] matrix) {

        int largestMatSize = 0;

        int maxSubMat = 0;
        if(matrix.length > matrix[0].length) {
            maxSubMat = matrix[0].length - 1;
        }
        else {
            maxSubMat = matrix.length - 1;
        }

        for(int x = maxSubMat; x >= 0; x--) {
            int[][] subMatrix = new int[x + 1][x + 1];
            for(int l = 0; l < matrix.length - x; l++) {
                for(int k = 0; k < matrix[l].length - x; k++) {
                    for(int i = l; i < x + 1 + l; i++) {
                        for(int j = k; j < x + 1 + k; j++) {
                            subMatrix[i - l][j - k] = matrix[i][j];
                        }
                    }
                    boolean ans = matrixSum(subMatrix);
                    if(ans) {
                        return x + 1;
                    }
                }
            }
        }

        return largestMatSize;
    }
}

