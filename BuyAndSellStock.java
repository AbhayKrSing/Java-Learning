public class BuyAndSellStock {
    // 1.Brute force (Very unoptimsed code.)
    // public static int maxProfileInStock(int arr[]) {
    // int n = arr.length;
    // int buyprice = Integer.MAX_VALUE;
    // int maxProfit = Integer.MIN_VALUE;
    // int finance_At_each_Day[] = new int[n - 1];
    // for (int i = 1; i < n; i++) {
    // for (int j = 0; j < i; j++) {
    // if (arr[j] < buyprice) {
    // buyprice = arr[j];
    // }
    // }
    // finance_At_each_Day[i - 1] = arr[i] - buyprice;
    // }
    // for (int i = 0; i < finance_At_each_Day.length; i++) {
    // if (maxProfit < finance_At_each_Day[i]) {
    // maxProfit = finance_At_each_Day[i];
    // }
    // }

    // return maxProfit;
    // }
    // 2.Optimised Code
    public static int maxProfileInStock(int arr[]) {
        int n = arr.length;
        int buyprice = arr[0]; // initial day is a day of buying not a selling.
        int maxProfit = Integer.MIN_VALUE; // to get max profit among all profit.
        int currentProfit = 0;
        for (int i = 1; i < n; i++) {
            if (buyprice > arr[i]) { // if(B.P>S.P)--> then there is always a -ve profit.So we don't need to
                                     // calculate profit.
                buyprice = arr[i]; // B.P=S.P because we need to track the minm buying price till now.
            } else {
                currentProfit = arr[i] - buyprice;
                maxProfit = Math.max(currentProfit, maxProfit);
            }

        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfileInStock(prices)); // O(n)

    }
}
