/**
 * NestedLoop_StarPattern
 */
public class NestedLoop_StarPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print("\n");
        }
    }

}