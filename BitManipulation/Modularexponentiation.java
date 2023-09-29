public class Modularexponentiation {
    public static int modularexponentiation(int a, int n, int mod) {
        int ans = 1;
        a %= mod; // to do modular exponentiation using small remainder (eg if a=6764738 and n=15
                  // then a*a will go out of range just by one operation to solve this we have
                  // used this step)
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = (ans * a) % mod;
                a = a * a;
                n = n >> 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = 5;
        int n = 15;
        int mod = 10;
        System.out.println(modularexponentiation(a, n, mod));
        ;
    }
}
