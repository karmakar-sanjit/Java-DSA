import java.util.Scanner;

public class StocksProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }

        int maximumProfit = 0;
        System.out.println(maxProfit(prices, maximumProfit, 0));
    }

    public static int maxProfit(int[] prices, int maximumProfit, int index) {
        if(index == prices.length){
            return maximumProfit;
        }
        for(int i = index + 1; i < prices.length; i++) {
            if(prices[index] < prices[i]) {
                int computeMaximumProfit = prices[i] - prices[index];
                if (computeMaximumProfit > maximumProfit) {
                    maximumProfit = computeMaximumProfit;
                }
            }
        }
        return maxProfit(prices, maximumProfit, index + 1);
    }
}

