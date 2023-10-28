package Recursion;

public class TilingProblem {
    public static int no_of_ways_of_tiling(int n) { // nothing but like a fibonacci sequence
        if (n == 0 || n == 1) {
            return 1;
        }
        int verticalTiling = no_of_ways_of_tiling(n - 1);
        int horizontalTiling = no_of_ways_of_tiling(n - 2);
        return verticalTiling + horizontalTiling;
    }

    public static void main(String[] args) {
        System.out.println(no_of_ways_of_tiling(4));
    }

}