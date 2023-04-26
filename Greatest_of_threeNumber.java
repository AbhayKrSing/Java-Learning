import java.util.Scanner;

public class Greatest_of_threeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 80, b = 60, c = 9;

        if (a >= b && a >= c) {
            System.out.println("A is greatest");
        } else if (b >= c) {
            System.out.println("B is greatest");
        } else {
            System.out.println("C is greatest");
        }

    }
}
