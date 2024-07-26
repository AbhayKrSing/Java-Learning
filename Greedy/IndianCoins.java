package Greedy;

import java.util.ArrayList;

public class IndianCoins {
    public static void main(String[] args) {
        int v = 1059;
        int denominations[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 }; // sort in descending order if denomination is
                                                                       // given in Random order
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = denominations.length - 1; i >= 0; i--) {
            if (v == 0) {
                break;
            }
            if (denominations[i] <= v) { // you can also use while loop here instead doing
                ans.add(denominations[i]);
                v -= denominations[i];
                i++;
            }
            // if (denominations[i] <= v) {
            // while (denominations[i] <= v) {
            // ans.add(denominations[i]);
            // v -= denominations[i];
            // }
            // }
        }
        System.out.println(ans + "-->" + ans.size());
    }
}
