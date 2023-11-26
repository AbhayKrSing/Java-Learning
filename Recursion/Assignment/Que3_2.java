package Recursion.Assignment;

public class Que3_2 {
    public static int fn(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return fn(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "Abhay";
        System.out.println(fn(str));
    }
}
