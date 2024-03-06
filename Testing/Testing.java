package Testing;

public class Testing {
    static int N = 8;

    public static void printSolution(int sol[][]) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++)
                System.out.print(sol[x][y] + " ");
            System.out.println();
        }
    }

    public static boolean solveKTUtil(int x, int y, int movei, int sol[][]) {
        if (movei == N * N) {
            return true;
        }
        int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        for (int k = 0; k < 8; k++) {
            int next_x = x + xMove[k];
            int next_y = y + yMove[k];
            if (next_y >= 0 && next_y < sol.length && next_x >= 0 && next_x < sol.length
                    && sol[next_x][next_y] == -1) {
                sol[next_x][next_y] = movei;
                if (solveKTUtil(next_x, next_y, movei + 1, sol)) {
                    return true;
                }
                sol[next_x][next_y] = -1; // backtracking
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int sol[][] = new int[8][8];
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                sol[x][y] = -1;
            }
        }

        // As the Knight starts from cell(0,0)
        sol[0][0] = 0;
        if (solveKTUtil(0, 0, 1, sol)) {
            printSolution(sol);
        } else
            System.out.println("Solution does not exist");

    }
}