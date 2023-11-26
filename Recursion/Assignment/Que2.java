package Recursion.Assignment;

public class Que2 {
    public static String fn(String[] tomap, int lastdigit, int newNum, String str) {
        if (newNum == 0 && lastdigit == 0) { // base case
            return str;
        }
        return fn(tomap, newNum % 10, newNum / 10, tomap[lastdigit] + " " + str);
    }

    public static void main(String[] args) {
        int n = 1970;
        String tomap[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        System.out.println(fn(tomap, n % 10, n / 10, ""));
        ;

    }
}
