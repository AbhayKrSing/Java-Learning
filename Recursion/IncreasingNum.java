package Recursion;

public class IncreasingNum {
    public static void printIncreasingOrder(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncreasingOrder(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printIncreasingOrder(n);
    }
}
