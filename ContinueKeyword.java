import java.util.Scanner;

public class ContinueKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number :");
            int number = sc.nextInt();
            if (number % 10 == 0) {
                continue;
            }
            System.out.println("The Number is " + number);
        }
    }
}
