package String;

public class Substring {
    public static String makesubstring(String str, int i, int e) {
        String substr = "";
        for (int j = i; j < e; j++) {
            substr += str.charAt(j);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        int i = 3;
        int e = 7;
        System.out.println(makesubstring(str, i, e));
        System.out.println(str.substring(i, e)); // built in fn
    }
}
