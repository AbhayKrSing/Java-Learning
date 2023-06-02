import java.lang.Math;

public class checkingMathclass {
    public static void main(String[] args) {
        int pow = (int) Math.pow(2, 4);
        int min = Math.min(-4, -7);
        int max = Math.max(10, 40);
        int sqrt = (int) Math.sqrt(9);
        float avg = (float) Math.abs(-4.4); // gives mod value
        System.out.println(pow);
        System.out.println(min);
        System.out.println(max);
        System.out.println(sqrt);
        System.out.println(avg);
    }
}
