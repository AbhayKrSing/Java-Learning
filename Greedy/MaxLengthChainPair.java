package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainPair {
    public static void main(String[] args) {
        int[][] pairs = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int count = 1;
        int endOfChain = pairs[0][1]; // lastSelected of 1st pair

        for (int i = 1; i < pairs.length; i++) {
            if (endOfChain < pairs[i][0]) { // lastSelected <= pair's start
                count++;
                endOfChain = pairs[i][1];
            }
        }
        System.out.println("Maxm length of chain is : " + count);

    }
}
