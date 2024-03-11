import java.util.*;

public class Testing2 {
    public static void print2dArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] merge(int[][] intervals) {
        List<List<Integer>> mainlist = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        for (int i = 0; i < intervals.length; i++) {
            if (!mainlist.isEmpty() && mainlist.get(mainlist.size() - 1).get(1) >= intervals[i][0]) {
                int set = Math.max(intervals[i][1], mainlist.get(mainlist.size() - 1).get(1));
                List<Integer> lst = mainlist.get(mainlist.size() - 1);
                lst.set(1, set);
                mainlist.set(mainlist.size() - 1, lst);
            } else {
                mainlist.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }

        }
        System.out.println(mainlist);
        int[][] result = new int[mainlist.size()][2];
        for (int i = 0; i < mainlist.size(); i++) {
            List<Integer> sublist = mainlist.get(i);
            for (int j = 0; j < sublist.size(); j++) {
                result[i][j] = sublist.get(j);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // int[][] n = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        // int[][] n = { { 1, 4 }, { 4, 5 } };
        // int[][] n = { { 1, 3 } };
        int[][] n = { { 1, 4 }, { 0, 2 }, { 3, 5 } };
        print2dArray(merge(n));
    }

}