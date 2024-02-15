import java.util.ArrayList;
import java.util.List;

public class Testing {
    public static void print2dArray(int num[][]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> pascalTriangle(int N) {
        List<List<Integer>> a = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int ans = 1;
            List<Integer> lst = new ArrayList<>();
            a.add(lst);
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    lst.add(ans);
                } else {
                    ans = ans * (i - j);
                    ans = ans / j;
                    lst.add(ans);
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(pascalTriangle(n));
    }
}