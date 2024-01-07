import java.util.ArrayList;
import java.util.List;

public class Testing2 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int sr = 0;
        int sc = 0;
        int ec = matrix[0].length - 1;
        int er = matrix.length - 1;

        while (sr <= er && sc <= ec) {
            // top
            for (int i = sc; i < ec; i++) {
                arr.add(matrix[sr][i]);
            }
            // right
            for (int i = sr; i < er; i++) {
                arr.add(matrix[i][ec]);
            }
            // bottom
            for (int i = ec; i > sc; i--) {
                arr.add(matrix[er][i]);
            }
            // left
            for (int i = er; i > sr; i--) {
                arr.add(matrix[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
            if (sr == er && sc == ec) {
                arr.add(matrix[sr][ec]);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

    }
}