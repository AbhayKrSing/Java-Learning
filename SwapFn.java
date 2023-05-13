import java.util.Scanner;

public class SwapFn {
    public static void main(String[] args) {
        // swap two values
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t;
        t = a;
        a = b;
        b = t;
        System.out.println(a);
        System.out.println(b);
    }

}