import java.util.Scanner;

public class CheckThePrimeNo_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        System.out.print("Write Number :");
        int number = sc.nextInt();
        if (number == 2) {
            System.out.println("Number is Prime");
            sc.close();
            return;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // Optimised code loop will run under root n times
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
        sc.close();
    }
}
