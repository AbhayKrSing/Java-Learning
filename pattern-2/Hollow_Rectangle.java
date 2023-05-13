public class Hollow_Rectangle {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            char ch = '*';
            for (int j = 1; j <= n + 1; j++) {
                if (i == 1 || i == n) {
                    System.out.print(ch);
                } else {
                    if (j == n + 1) {
                        ch = '*';
                    }
                    System.out.print(ch);
                    ch = ' ';
                }

            }
            System.out.println();
        }
    }

}