public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibonacciNo(4);
        System.out.println(ans);
    }

    static int fibonacciNo(int n) {
        if(n < 2){
            return n;
        }
        else {
            return fibonacciNo(n - 1) + fibonacciNo(n - 2);
        }
    }
}
