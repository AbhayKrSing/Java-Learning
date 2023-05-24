public class FactorialofN {
    public static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        // 1. algo (5X4X3X2X1)
        // int n = 5;
        // int fact = 1;
        // for (int i = n; i > 0; i--) {
        // fact *= i;
        // }
        // System.out.println(fact);

        // 2. algo(1X2X3x4x5)
        // int n = 6;
        // int fact = 1;
        // for (int i = 1; i <= n; i++) {
        // fact *= i;
        // }
        // System.out.println(fact);

        factorial(6);
    }
}
