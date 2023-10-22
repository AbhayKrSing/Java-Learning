package Recursion;

public class DecreasingNnum {
    public static void printDecreasingNum(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        printDecreasingNum(n - 1);

    }

    public static void main(String[] args) {
        int n = 10;
        printDecreasingNum(n);
    }

}