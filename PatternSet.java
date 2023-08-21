public class PatternSet {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern1(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for(int row = 1; row <= 2*n-1; row++) {
            int totalColInRow = row <= n ? row : 2 * n - row;
            for(int col = 1; col <= totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for(int row = 1; row <= 2*n-1; row++) {
            int totalColInRow = row <= n ? row : 2 * n - row;
            int noOfSpaces = n - totalColInRow;

            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }

            for(int col = 1; col <= totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
