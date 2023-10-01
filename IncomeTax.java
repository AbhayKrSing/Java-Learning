import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write your income :");
        float income = sc.nextFloat();
        float tax = 0;
        if (income <= 500000) {
            System.out.print("tax is : ");
            System.out.println(tax);

        } else if ((income > 500000) && (income < 1000000)) {
            tax = 0.2f * income;
            System.out.print("tax is : ");
            System.out.println(tax);
        } else {
            tax = 0.3f * income;
            System.out.print("tax is : ");
            System.out.println(tax);
        }
        sc.close();

    }

}