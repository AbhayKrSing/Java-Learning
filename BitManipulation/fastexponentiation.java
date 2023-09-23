public class fastexponentiation {
    public static int fastexpo(int a, int n) {
        int ans = 1;
        // for (int i = 0; i < a; i++) { //using for loop
        // if ((n & 1) == 1) { //set bit.
        // ans = ans * a;
        // }
        // n = n >> 1;
        // a = a * a;
        // }
        while (n > 0) {
            if ((n & 1) != 0) {// set bit
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastexpo(3, 5));
    }
}
