import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        // 1. This is not optimised code

        // Scanner sc = new Scanner(System.in);
        // int year = sc.nextInt();
        // if (year % 4 == 0) {
        // if (year % 100 == 0) {
        // if (year % 400 == 0) {
        // System.out.println("Year is Leap year");
        // } else {
        // System.out.println("Year is not a Leap year");
        // }
        // } else {
        // System.out.println("Year is Leap year");
        // }
        // } else {
        // System.out.println("Year is not a Leap year");
        // }

        // This is optimised code
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean x = (year % 4 == 0) ? true : false;
        boolean y = (year % 100 == 0) ? true : false;
        boolean z = (year % 400 == 0) ? true : false;
        if (((x && y) && z) || (x && !y)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
        sc.close();

    }
    // More optimised and easy code is on notes
}
