public class Inverted_StarPattern {
    public static void main(String[] args) {
        // 1.My logic
        // for (int i = 10; i >= 1; i--) {
        // // one line
        // for (int j = 1; j <= i; j++) {
        // System.out.print('*');
        // }
        // System.out.println();
        // }

        // 2.shraddha's logic
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) { // n-i+1
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
