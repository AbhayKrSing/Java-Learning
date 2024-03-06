package backTracking.Assignment;

public class KnightTour {
    public static void printgrid(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean getorder(int grid[][], int row, int col, int i) {
        // base case
        if (i == grid.length * grid.length) {
            return true;
        }
        int d1[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int d2[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        for (int j = 0; j < 8; j++) {
            int nextrow = row + d1[j];
            int nextcol = col + d2[j];
            if (nextcol >= 0 && nextcol < grid.length && nextrow >= 0 && nextrow < grid.length
                    && grid[nextrow][nextcol] == -1) {
                grid[nextrow][nextcol] = i;
                if (getorder(grid, nextrow, nextcol, i + 1)) {
                    return true;
                }
                grid[nextrow][nextcol] = -1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int N = 8;
        int grid[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = -1;
            }
        }
        grid[0][0] = 0;
        if (getorder(grid, 0, 0, 1)) {
            printgrid(grid);
        } else {
            System.out.println("Soln don't exists");
        }
    }
}
