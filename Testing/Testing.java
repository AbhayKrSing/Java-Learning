package Testing;

import java.util.Stack;

/**
 * Testing
 */
public class Testing {
    public static String multTheString(StringBuilder str, int times) {
        StringBuilder appendme = new StringBuilder("");
        for (int i = 0; i < times; i++) {
            appendme.append(str);
        }
        return appendme.toString();
    }

    public static String decodeString(String s) { // stack optimum approach
        Stack<Integer> cnt = new Stack<>();
        Stack<String> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            int j = i;
            int num = 0;
            while (j < s.length() && (s.charAt(j) >= 48 && s.charAt(j) <= 57)) {
                num = (num * 10) + (s.charAt(j) - '0');
                j++;
            }
            if (num > 0) {
                System.out.println(num);
                cnt.push(num);
                i = j - 1;
                continue;
            }
            if (s.charAt(i) == ']') {
                StringBuilder temp = new StringBuilder("");
                while (!st.isEmpty() && !st.peek().toString().equals("[")) {
                    temp.insert(0, st.pop());
                }
                if (!st.isEmpty()) {
                    st.pop();
                }
                String temps = multTheString(temp, cnt.pop());
                st.push(temps);
            } else {
                st.push(s.charAt(i) + "");
            }
        }

        StringBuilder ans = new StringBuilder("");
        while (!st.isEmpty()) {
            ans.insert(0, st.pop());
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "100[leetcode]";
        System.out.println(decodeString(str));
        ;
    }
}