public class problem3 {
    public static void printmatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Transpose(int[][] arr) {
        int transpose[][] = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        printmatrix(transpose);
    }

    public static void main(String[] args) {
        int nums[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        printmatrix(nums);
        Transpose(nums);
    }
}
