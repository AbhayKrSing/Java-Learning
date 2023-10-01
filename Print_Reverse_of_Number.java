import java.util.Scanner;

public class Print_Reverse_of_Number {
    // Print the Reverse of a Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a Number :");
        int input = sc.nextInt();
        for (int n = input; n != 0; n /= 10) {
            System.out.print(n % 10);
            System.out.print(' ');
        }
        sc.close();
    }
}
