package Stack;

import java.util.Stack;

public class DuplicateValidParenthesis {
    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                int count = 0;
                while (st.peek() != '(') {
                    st.pop();
                    count++;
                }
                if (count == 0) {
                    return true;
                }
                st.pop();
            } else {
                st.push(str.charAt(i));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+(b))+(c+d)))";
        System.out.println(isValid(str));
        ;
    }
}
