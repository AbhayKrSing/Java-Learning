package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_knapsack {
    public static void main(String[] args) {
        int[] value = { 100, 60, 120 };
        int[] weight = { 20, 10, 30 };
        int capacity = 50;
        int maxValue = 0;
        double[][] table = new double[value.length][3]; // you can also use just idx and ratio in 2d array this will
                                                        // make arraySize to 2.
        for (int i = 0; i < table.length; i++) {
            table[i][0] = weight[i]; // weight
            table[i][1] = value[i]; // value
            table[i][2] = value[i] / (double) weight[i]; // ratio
        }
        Arrays.sort(table, Comparator.comparingDouble(o -> o[2]));

        for (int i = table.length - 1; i >= 0; i--) {
            if (table[i][0] <= capacity) {
                capacity -= table[i][0];
                maxValue += table[i][1];
            } else {
                maxValue += (table[i][2] * capacity);
                capacity = 0;
                break;
            }
        }
        System.err.println("Max Total value is knapsack is : " + maxValue);
    }
}
