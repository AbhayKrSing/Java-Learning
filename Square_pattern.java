import java.util.Scanner;

public class Square_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }
        // System.out.print();
    }
}
