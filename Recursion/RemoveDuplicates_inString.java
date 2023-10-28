package Recursion;

//1.Using Loop
public class RemoveDuplicates_inString {
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder("");
        int[] tracker = new int[26]; // a-z 26 alphabets.
        for (int i = 0; i < str.length(); i++) {
            if (tracker[str.charAt(i) - 'a'] != 1) { // tracker[str.charAt(i) - 97] != 1
                sb.append(str.charAt(i));
                tracker[str.charAt(i) - 'a'] = 1;
            }
        }
        return sb.toString();

    }

    public static String removeDuplicates_using_Recursion(String str, boolean map[], StringBuilder sb, int i) {
        if (i == str.length()) {
            return sb.toString();
        } else if (map[str.charAt(i) - 'a'] != true) {
            sb.append(str.charAt(i));
            map[str.charAt(i) - 'a'] = true;
        }
        return removeDuplicates_using_Recursion(str, map, sb, i + 1);

    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        boolean map[] = new boolean[26];
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        System.out.println(removeDuplicates_using_Recursion(str, map, sb, i));
    }
}
