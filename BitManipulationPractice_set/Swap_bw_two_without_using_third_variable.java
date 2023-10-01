
public class Swap_bw_two_without_using_third_variable {
    public static void main(String[] args) {
        int x = 15;
        int y = 14;
        x = x ^ (x ^ y);
        y = y ^ (x ^ y);
        System.out.println(x);
        System.out.println(y);
    }
}
