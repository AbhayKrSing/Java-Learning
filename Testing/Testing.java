package Testing;

import java.util.ArrayList;
import java.util.List;

public class Testing {

    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int sr = 0;
        int sc = 0;
        int ec = matrix[0].length - 1;
        int er = matrix.length - 1;

        while (sr <= er && sc <= ec) {
            // top
            for (int i = sc; i <= ec; i++) {
                arr.add(matrix[sr][i]);
            }
            // right
            for (int i = sr + 1; i <= er; i++) {
                arr.add(matrix[i][ec]);
            }
            // bottom
            for (int i = ec - 1; i >= sc; i--) {
                if (sr == er) {
                    break;
                }
                arr.add(matrix[er][i]);
            }
            // left
            for (int i = er - 1; i > sr; i--) {
                if (sc == ec) {
                    break;
                }
                arr.add(matrix[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
            if (sr == er && sc == ec) {
                arr.add(matrix[sr][ec]);
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums[][] = { { 7 }, { 9 }, { 6 } };
        System.out.println(spiralOrder(nums));
        ;
    }
}
