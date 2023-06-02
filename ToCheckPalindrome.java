public class ToCheckPalindrome {
    public static int ReverseNumber(int n) { // method to reverse number
        int revNo = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            revNo = lastdigit + (revNo * 10);
            n = n / 10;
        }
        return revNo;
    }

    public static boolean isPalindrome(int num) { // method to
        return num == ReverseNumber(num);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
}
