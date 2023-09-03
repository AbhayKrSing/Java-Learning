package Array2d;

public class DiagonalSum {
    public static void DiagonalSuming(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) { // time complexity is O(n)
            // there is one more way of brute force in which
            // you will iterate element one by one and add them a/q to their condn
            // such type have time complexoty o(n^2)

            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int nums[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int nums2[][] = { { 1, 2, 3 }, { 3, 4, 5 }, { 6, 7, 8 } };
        DiagonalSuming(nums2);
    }
}
