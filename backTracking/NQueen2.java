package backTracking;

public class NQueen2 {
    static int count = 0; // for counting ways

    public static void print(char board[][]) {
        System.out.println("---chessboard---");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonally right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonally left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void Nqueens(char[][] board, int row) {
        // base case
        if (row == board.length) {
            // print(board);
            // Instead print we will use count here
            count++;
            return;
        }

        // kaam and fn call
        for (int i = 0; i < board[0].length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                Nqueens(board, row + 1);
                board[row][i] = 'X';
            }
        }

    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        // intialize
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 'X';
            }
        }
        Nqueens(board, 0);
        System.out.println("Total ways to solve n queens : " + count);
    }
}
