import java.util.Scanner;

public class print_number {
    public static void main(String[] args) {
        // print numbers upto 10
        /*
         * int i = 0;
         * while (i < 10) {
         * System.out.print(i + 1);
         * System.out.print(' ');
         * i++;
         * }
         */
        // print numbers upto n
        Scanner sc = new Scanner(System.in);
        System.out.print("Write value of n :");
        int n = sc.nextInt();
        int i = 0;
        while (i < n) {
            System.out.print(i + 1);
            System.out.print(' ');
            i++;
        }
        sc.close();

    }
}
