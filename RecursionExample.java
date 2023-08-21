public class RecursionExample {
    public static void main(String[] args) {
        getHello(10);
    }

    private static void getHello(int n) {
        if(n == 0){
            return;
        }
        getHello(n-1);
        System.out.println("Hello " + n);
    }

}
