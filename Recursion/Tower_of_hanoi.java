package Recursion;

public class Tower_of_hanoi {
    public static void fn(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Move disc " + n + " from " + source + " to " + destination);
            return;
        }
        fn(n - 1, source, destination, helper);
        System.out.println("Move disc " + n + " from " + source + " to " + destination);
        fn(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        fn(n, "A", "B", "C");
    }
}
