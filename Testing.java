import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Testing {
    public static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] merge(int[][] intervals) {
        int[][] ans = new int[intervals.length][intervals[0].length];
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        for (int i = 0; i < intervals.length; i++) {
            if (i == intervals.length - 1 && intervals[i][1] < ans[i - 1][1]) { // check
                continue;
            }
            ans[i] = intervals[i];

            for (int j = i + 1; j < intervals.length; j++) { // for merging
                // getting end of selected interval
                int endOfSelectedInterval = ans[i][1];
                // check if end of selectedInterval is greater than currentInterval Start
                int StartOfcurrentInterval = intervals[j][0];
                if (endOfSelectedInterval > StartOfcurrentInterval) {
                    int newvalue = Math.max(endOfSelectedInterval, intervals[j][1]); // endOfSelectedInterval,endOfcurrentInterval
                    ans[i][1] = newvalue;
                } else {
                    i = j - 1;
                    break;
                }

            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[][] n = { { 1, 3 }, { 2, 4 }, { 2, 6 }, { 8, 9 }, { 8, 10 }, { 9, 11 }, { 15, 18 }, { 16, 17 } };
        print2dArray(merge(n));
    }
}