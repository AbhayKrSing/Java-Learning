package Recursion.Assignment;

public class Que4_2 {
    public static int fn(String str, int i, int j, int n) {

        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int res = fn(str, i + 1, j, n - 1) + fn(str, i, j - 1, n - 1)
                - fn(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int res = fn(str, 0, str.length() - 1, str.length());
        System.out.println(res);
    }
}
