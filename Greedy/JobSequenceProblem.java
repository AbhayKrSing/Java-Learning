package Greedy;

import java.util.Arrays;
import java.util.Comparator;

//dekhta hu
public class JobSequenceProblem {
    public static void main(String[] args) {
        int job[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        int jobArray[][] = new int[job.length][3];
        for (int i = 0; i < jobArray.length; i++) {
            jobArray[i][0] = i;
            jobArray[i][1] = job[i][0];
            jobArray[i][2] = job[i][1];
        }

        Arrays.sort(jobArray, Comparator.comparingDouble(o -> o[2]));

        System.out.println();

    }
}
