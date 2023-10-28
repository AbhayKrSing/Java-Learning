package Recursion;

public class x_To_The_powerN {
    public static int getpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int fn = getpower(x, n - 1); // faith
        return x * fn;
    }

    public static void main(String[] args) {
        System.out.println(getpower(2, 5));
    }
}
