public class BinomialCoefficient {
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoefficient(int n, int r) {
        return (fact(n) / (fact(r) * fact(n - r)));
    }

    public static void main(String[] args) {
        int n = 6;
        int r = 4;
        System.out.println(binomialCoefficient(n, r));

    }
}
