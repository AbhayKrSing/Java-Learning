import java.util.Scanner;

public class Sum_of_NaturalNo {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.print("Write range :");
        int range = sc.nextInt();
        while (i <= range) {
            sum += i;
            i++;
        }
        System.out.println("Sum is :" + sum);
    }
}
