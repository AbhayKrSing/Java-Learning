package String;

public class LexicographicOrder { // find largest in lexicographic order
    public static void lexicographicOrder(String str[]) {
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (largest.compareToIgnoreCase(str[i]) < 0) {
                largest = str[i];
            }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        String strs[] = { "apple", "banana", "mango" };
        lexicographicOrder(strs);
    }
}
