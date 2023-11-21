package Recursion;

public class BinaryStringProblem {
    public static void printbinarystring(StringBuilder str, char lastchar, int n) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        if (lastchar == '0' || lastchar == Character.MIN_VALUE) {
            printbinarystring(str.append('0'), '0', n - 1);
            str.deleteCharAt(str.length() - 1);
            printbinarystring(str.append('1'), '1', n - 1);
            str.deleteCharAt(str.length() - 1);
        } else {
            printbinarystring(str.append('0'), '0', n - 1);
            str.deleteCharAt(str.length() - 1);
        }

    }

    public static void main(String[] args) {
        int n = 3;
        printbinarystring(new StringBuilder(""), Character.MIN_VALUE, n);
    }
}