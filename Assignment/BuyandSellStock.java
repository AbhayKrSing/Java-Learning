package Assignment;

public class BuyandSellStock {
    public static int maxProfit(int[] prices) {
        int bp = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int sp = prices[i];
            if (bp > sp) {
                bp = sp;
            } else {
                maxProfit = Math.max(sp - bp, maxProfit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(prices));
    }
}
