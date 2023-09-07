package String;

public class Touppercase {
    public static void eachworlduppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        // int i = 1;
        // while (i < str.length()) { //Using while loop
        // if (str.charAt(i) == ' ' && i < str.length() - 1) {
        // sb.append(' ');
        // ch = Character.toUpperCase(str.charAt(i + 1));
        // sb.append(ch);
        // i = i + 2;
        // } else {
        // sb.append(str.charAt(i));
        // i++;
        // }
        // }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) { // If last space in empty.
                sb.append(' ');
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "i m abhay kr singh";
        eachworlduppercase(str);
    }
}
