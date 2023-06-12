import java.util.Scanner;

//Abhay's logic
public class CheckThePrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 2) {
            System.out.println("Prime No");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("Not a Prime No.");
                    break;
                } else if (i == number - 1) {
                    System.out.println("Prime No");
                }
            }
        }
        sc.close();
    }

}