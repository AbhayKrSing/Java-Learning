package Recursion;

public class NaturalNumSum {
    public static int sumofNnum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumofNnum(n - 1);

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(sumofNnum(n));

    }
}
