import java.lang.Math;

public class BinaryToDecimal {
    public static int binaryTodecimal(int n) { // abhay's code
        int decimal = 0;
        for (int i = 0; n > 0; i++) {
            int lastDigit = n % 10;
            decimal += (lastDigit * (Math.pow(2, i)));
            n /= 10;
        }
        return decimal;
    }

    public static int shraddhabinaryToDecimal(int n) {
        int lastDigit = n % 10;
        int pow = 0;
        int decimal = 0;
        while (n > 0) {
            decimal += lastDigit * (int) Math.pow(2, pow);
            pow++;
            n = n / 10;
            lastDigit = n % 10;
        }
        return decimal;

    }

    public static void main(String[] args) {
        System.out.println(binaryTodecimal(11101));
        System.out.println(shraddhabinaryToDecimal(11111));
    }
}
