import java.util.Scanner;

public class findOddandEven {
    public static void find(int num) {
        int bitmask = 1;
        if ((num & bitmask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        find(num);
        sc.close();
    }
}