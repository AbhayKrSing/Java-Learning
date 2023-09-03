package Array2d;

public class SpiralMatrix {
    public static void PrintSpiralMatrix(int matrix[][]) {
        int StartRow = 0;
        int EndRow = matrix.length - 1;
        int StartCol = 0;
        int EndCol = matrix[0].length - 1;
        while (StartRow <= EndRow && StartCol <= EndCol) {
            for (int i = StartCol; i < EndCol; i++) // top
            {
                System.out.print(matrix[StartRow][i] + " ");
            }
            for (int i = StartRow; i < EndRow; i++) { // right
                System.out.print(matrix[i][EndCol] + " ");
            }
            for (int i = EndCol; i > StartCol; i--) { // bottom
                System.out.print(matrix[EndRow][i] + " ");
                if (EndRow == StartRow) { // condn for n*m where n<m (only then StartRow==EndRow) and n,m is odd
                    break;
                }
            }
            for (int i = EndRow; i > StartRow; i--) { // left
                System.out.print(matrix[i][StartCol] + " ");
                if (EndCol == StartCol) { // condn for n*m where n>m (only then StartCol==EndCol)and n,m is odd
                    break;
                }
            }
            if (StartRow == EndRow && StartCol == EndCol) { // Condn for n*n to be odd
                System.out.print(matrix[StartRow][EndCol]);
                break;
            }
            StartRow++;
            StartCol++;
            EndRow--;
            EndCol--;
        }
    }

    public static void main(String[] args) {
        int nums[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } }; // 4*4 shi kaam kar
                                                                                                  // rha
        int nums2[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }; // 3*4 shi kaam karrha
        int nums3[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } }; // 3*5 ek element ek baar
                                                                                           // jada print ho rha.
        int nums4[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // 3*3 middle element print nhi ho rha.
        int nums5[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 } }; // 5*3
        PrintSpiralMatrix(nums5);
    }
}
