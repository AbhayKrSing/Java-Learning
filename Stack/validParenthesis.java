package Stack;

import java.util.Stack;

public class validParenthesis {
    public static boolean checkValidity(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                st.push(str.charAt(i));
            } else if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
                if (st.isEmpty()) {
                    return false;
                }
                if ((st.peek() == '(' && str.charAt(i) == ')') || (st.peek() == '{' && str.charAt(i) == '}')
                        || (st.peek() == '[' && str.charAt(i) == ']')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (!st.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "(){(([]))}{[]}";
        System.out.println(checkValidity(str));
    }
}
