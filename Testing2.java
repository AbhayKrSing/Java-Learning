
public class Testing2 {
    static int count = 1;

    // public static void printIncreasingOrder(int n) { //wrong approach this is not
    // recursion ,this is stupidity.
    // if (n == 1) {
    // System.out.println(count);
    // return;
    // }
    // System.out.println(count);
    // count++;
    // printIncreasingOrder(n - 1);
    // }
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