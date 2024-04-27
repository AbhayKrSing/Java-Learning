package Stack;

import java.util.Stack;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Yash";
        StringBuilder ans = new StringBuilder("");
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        while (!s.isEmpty()) {
            ans.append(s.pop());
        }
        System.out.println(ans.toString());
    }
}
