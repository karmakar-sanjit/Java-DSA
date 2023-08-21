import java.util.Scanner;

public class MaxHolidays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDays = sc.nextInt();
        int len = sc.nextInt();
        int cancel = sc.nextInt();

        int[] obj = new int[len];
        for(int i = 0; i < obj.length; i++) {
            obj[i] = sc.nextInt();
        }
        System.out.println(maxConsecutiveDays(obj, cancel, totalDays));
    }

    public static int maxConsecutiveDays(int[] obj, int cancel, int totalDays) {
        for(int i = 0; i < obj.length - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if(obj[j] < obj[j-1]){
                    int temp = obj[j];
                    obj[j] = obj[j-1];
                    obj[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }

        int maxDays = 0;
        for(int i = 0 ; i < obj.length - cancel; i++) {
            if(i == 0) {
                int calMaxDays = obj[i + cancel] - 1;
                if(maxDays < calMaxDays) {
                    maxDays = calMaxDays;
                }
            }
            else {
                int calMaxDays = obj[i + cancel] - obj[i - 1] - 1;
                if (maxDays < calMaxDays) {
                    maxDays = calMaxDays;
                }
            }
        }

        int calMaxDays = totalDays - obj[obj.length - 1 - cancel];
        if (maxDays < calMaxDays) {
            maxDays = calMaxDays;
        }
        return maxDays;
    }
}
