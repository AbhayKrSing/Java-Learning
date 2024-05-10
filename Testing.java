public class Testing {
    public static int myAtoi(String s) {
        int idx = -1;
        int sign = 1;
        double num = 0; // will use for reconstruction
        for (int i = 0; i < s.length() && s.charAt(i) == ' '; i++) { // ignoring leading spaces
            idx = i;
        }
        // checking sign
        idx++;
        if (s.length() == 0 || idx == s.length()) {
            return 0;
        } else if (s.charAt(idx) == '-') {
            sign = -1;
        } else if (s.charAt(idx) == '+') {
            sign = 1;
        } else if (s.charAt(idx) >= 48 && s.charAt(idx) <= 57) {
            idx--;
        } else {
            return 0;
        }
        // getting numbers

        for (int i = idx + 1; i < s.length() && (s.charAt(i) <= 57 && s.charAt(i) >= 48); i++) {
            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;
        }
        if (num > Integer.MAX_VALUE) {
            return sign > 0 ? (int) num * sign : (int) num * sign - 1;
        }
        return (int) num * sign;

    }

    public static void main(String[] args) {
        String s = "2147483646";
        System.out.println(myAtoi(s));
        ;

    }
}