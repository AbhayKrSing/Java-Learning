import java.util.Scanner;

// rev=(rev*10)+lastDigit
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a Number:");
        int n = sc.nextInt();
        int reverseNumber = 0;
        while (n > 0) {
            int LastDigit = n % 10;
            reverseNumber = (reverseNumber * 10) + LastDigit;
            n /= 10;
        }
        System.out.println(reverseNumber);
    }

}