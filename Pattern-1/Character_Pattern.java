public class Character_Pattern {
    public static void main(String[] args) {
        // print number in given Character pattern
        int n = 4;
        // int number = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(number);
        // number++;
        // }
        // System.out.println();
        // }

        // print Character pattern
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
