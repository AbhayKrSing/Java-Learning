public class Testing2 {
    static int sign = 1;
    static boolean check = true;

    public static double ImplementAtoi(StringBuilder s, int i) {
        // base case
        if (i < 0) {
            return 0;
        }
        // fn call and work
        double ans = ImplementAtoi(s, i - 1);
        if (!check) {
            return ans;
        }
        double ch = s.charAt(i);
        if (ch == ' ') {

        } else if ((ch == '-' || ch == '+') && check) {
            sign = (ch == '-') ? -1 : 1;
        } else if (check && (ch <= '9' && ch >= '0')) {
            ans = ans * 10 + (ch - '0');
        } else {
            check = false;
        }
        return ans;
    }

    public static int myAtoi(String s) {
        StringBuilder str = new StringBuilder(s);
        double ans = ImplementAtoi(str, s.length() - 1);

        return (int) (ans * sign);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("0-1"));
    }
}