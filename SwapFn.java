import java.util.Scanner;

public class SwapFn {
    public static void swap(int a, int b) {
        int t;
        t = a;
        a = b;
        b = t;
        System.out.println("After calling to the swap function");
        System.out.print(a + " ");
        System.out.println(b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before calling to the swap function");
        System.out.print(a + " ");
        System.out.println(b);
        swap(a, b);
        System.out.println("After swap fn get executed");
        System.out.print(a + " ");
        System.out.println(b);
        System.out.println("clearly value of a and b not changed inside main fn due to call by value mechanism");
    }
}
