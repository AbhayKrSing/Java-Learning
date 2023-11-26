package Recursion.Assignment;

public class Que4 {
    public static int fn(String str, int i, int j, int count) {
        if (i >= str.length()) { // base case
            return count;
        }
        if (j >= str.length()) {
            return fn(str, i + 1, i, count);
        }
        if (str.charAt(i) == str.charAt(j)) {
            return fn(str, i, j + 1, count + 1);
        } else {
            return fn(str, i, j + 1, count);
        }

    }

    public static void main(String[] args) {
        System.out.println(fn("abcab", 0, 0, 0));
    }
}
