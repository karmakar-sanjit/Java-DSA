import java.util.Scanner;

public class FindMagicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int value = num;
        while(value != 1 && value != 4) {
            value = isHappyNumber(value);
        }
        if(value == 1){
            System.out.println("Magic no");
        }
        else{
            System.out.println("No");
        }
    }

    public static int isHappyNumber(int value) {
        int sqValue = 0;
        while(value > 0){
            int rem = value % 10;
            sqValue = sqValue + (rem * rem);
            value = value / 10;
        }
        return sqValue;
    }

}
