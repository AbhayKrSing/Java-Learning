package backTracking;

public class Sudoku {
    public static void printsudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // horizontal
        for (int j = 0; j < 9; j++) {
            if (digit == sudoku[row][j]) {
                return false;
            }
        }
        // vertical
        for (int i = 0; i < 9; i++) {
            if (digit == sudoku[i][col]) {
                return false;
            }
        }
        // grid 3x3
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (digit == sudoku[i][j]) {
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }
        if (col == 9) {
            return sudokuSolver(sudoku, row + 1, 0);
        }
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, row, col + 1);
        }
        // fn call and kaam
        for (int i = 1; i < 10; i++) { // for each row's col ,digit need to be place(i=digit).
            if (isSafe(sudoku, row, col, i)) {
                sudoku[row][col] = i;
                if (sudokuSolver(sudoku, row, col + 1)) { // soln exists
                    return true;
                }
                sudoku[row][col] = 0; // backtrack steps(Imp steps)
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[][] sudoku = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        boolean result = sudokuSolver(sudoku, 0, 0);
        if (result) {
            System.out.println("----soln exists----");
            printsudoku(sudoku);
        } else {
            System.out.println("----No soln exists----");
            printsudoku(sudoku);
        }
    }
}
