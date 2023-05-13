public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(num);
                num++;
            }
            // for (int j = 1; j < i; j++) { //we don't need this.
            // System.out.print(" ");
            // }
            System.out.println();
        }
    }

}