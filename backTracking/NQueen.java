package backTracking;

public class NQueen {
    public static void print(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void Nqueens(char[][] board, int row) {
        // base case
        if (board.length == row) {
            print(board);
            return;
        }
        // kaam and fn call
        for (int j = 0; j < board[0].length; j++) {
            board[row][j] = 'Q';
            Nqueens(board, row + 1);
            board[row][j] = '.';
        }

    }

    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        // intialize
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '.';
            }
        }
        Nqueens(board, 0);
    }
}
