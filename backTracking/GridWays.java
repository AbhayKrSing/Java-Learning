package backTracking;

public class GridWays {

    public static int getways(int row, int col, int n, int m) {
        // base case
        if (row == n - 1 || col == m - 1) {
            return 1;
        }
        // fn call and kaam

        int ways = getways(row, col + 1, n, m) + getways(row + 1, col, n, m); // going down
        return ways;

    }

    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        System.out.println(getways(0, 0, n, m));
    }
}
