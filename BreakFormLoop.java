import java.util.Scanner;

public class BreakFormLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number :");
            int number = sc.nextInt();
            if (number % 10 == 0) {
                break;
            }
            System.out.println("The Number is" + number);
        }
        System.out.println("You are Out of Loop");
        sc.close();
    }
}
