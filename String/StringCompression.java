package String;

public class StringCompression {
    public static void stringcompression(String str) { // Time complexity is O(n)
        StringBuilder Sr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            count++;
            Sr.append(str.charAt(i));
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count != 1) {
                Sr.append(count);
            }
        }
        System.out.println(Sr);
    }

    public static void main(String[] args) {
        String str = "aaabbbbgcccdde";
        stringcompression(str);
    }
}