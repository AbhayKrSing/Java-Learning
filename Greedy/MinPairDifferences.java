package Greedy;

import java.util.Arrays;

public class MinPairDifferences {
    public static void main(String[] args) {
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 5, 6 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minAbs = 0;

        for (int i = 0; i < B.length; i++) {
            minAbs += Math.abs(A[i] - B[i]);
        }
        System.out.println(minAbs);
    }
}