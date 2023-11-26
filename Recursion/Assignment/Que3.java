package Recursion.Assignment;

public class Que3 {
    public static void fn(char ch, String str, int i) {
        try {
            fn(str.charAt(i++), str, i++);
        } catch (Exception e) {
            //base case
            System.out.println(i - 1);
            return;
        }
    }

    public static void main(String[] args) {
        String str = "Abhaykrggy";
        fn(str.charAt(0), str, 0);

    }
}
