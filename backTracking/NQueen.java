package backTracking;

public class NQueen {
    public static void Nqueens(char[][] board, int row) {
        // base case

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
    }
}
