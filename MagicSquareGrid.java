import java.util.Scanner;

public class MagicSquareGrid {
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

        int[] ithRowSum = new int[3];
        int[] ithColSum = new int[3];
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

        if(ithRowSum[0] != ithRowSum[1] || ithRowSum[1] != ithRowSum[2]) {
            return false;
        }

        if(ithColSum[0] != ithColSum[1] || ithColSum[1] != ithColSum[2]) {
            return false;
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
        int[][] subMatrix = new int[3][3];
        int count = 0;



        int noCount = 0;
        int totalElement = 0;
        for(int i = 0; i < matrix.length; i++) {
            totalElement = totalElement + matrix[i].length;
            for(int j = 0; j < matrix[i].length - 1; j++) {
                if(matrix[i][j] == matrix[i][j + 1]) {
                    noCount++;
                }
                else{
                    break;
                }
            }
            noCount++;
        }

        if(noCount == totalElement) {
            return 0;
        }

        for(int l = 0; l < matrix.length - 2; l++) {
            for(int k = 0; k < matrix[l].length - 2; k++) {
                for(int i = l; i < 3 + l; i++) {
                    for(int j = k; j < 3 + k; j++) {
                        subMatrix[i - l][j - k] = matrix[i][j];
                    }
                }
                boolean ans = matrixSum(subMatrix);
                if(ans) {
                    count++;
                }
            }
        }

        return count;
    }
}
