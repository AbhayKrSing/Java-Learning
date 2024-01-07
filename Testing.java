public class Testing {
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateMatrix(int[][] mat) {
        // 1.Transpose
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // 2.going through col and swap each elements of row with respective column
        for (int i = 0; i < mat.length; i++) {// row
            for (int j = 0; j < mat[0].length / 2; j++) {// col
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat[0].length - j - 1];
                mat[i][mat[0].length - j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
        rotateMatrix(matrix);
        printArray(matrix);
    }
}