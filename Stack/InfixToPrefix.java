import java.util.Stack;

public class InfixToPrefix {
    public static int pri(char ch) {
        switch (ch) {
            case '^':
                return 3;
            case '/':
                return 2;
            case '*':
                return 2;
            case '+':
                return 1;
            case '-':
                return 1;
            default:
                return 0;
        }
    }

    public static String InfixToPrefixConverter(String Infix) {
        StringBuilder ans = new StringBuilder("");
        Stack<Character> st = new Stack<>();
        for (int i = Infix.length() - 1; i >= 0; i--) {
            if ((Infix.charAt(i) >= 'a' && Infix.charAt(i) <= 'z') || (Infix.charAt(i) >= '1' && Infix.charAt(i) <= '9')
                    || (Infix.charAt(i) >= 'A' && Infix.charAt(i) <= 'Z') || Infix.charAt(i) == ')') {
                if (Infix.charAt(i) == ')') {
                    st.push(Infix.charAt(i));
                    continue;
                }
                ans.append(Infix.charAt(i));
            } else if (Infix.charAt(i) == '+' || Infix.charAt(i) == '-' || Infix.charAt(i) == '/'
                    || Infix.charAt(i) == '*' || Infix.charAt(i) == '^') {
                if (st.isEmpty()) {
                    st.push(Infix.charAt(i));
                    continue;
                }
                while (!st.isEmpty() && pri(st.peek()) > pri(Infix.charAt(i))) {
                    ans.append(st.pop());
                }

                while (!st.isEmpty() && (pri(st.peek()) == 3 && pri(Infix.charAt(i)) == 3)) { // handling '^'
                    ans.append(st.pop());
                }
                st.push(Infix.charAt(i));
            } else if (Infix.charAt(i) == '(') {
                while (st.peek() != ')') {
                    ans.append(st.pop());
                }
                st.pop();
            }
        }
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String[] testCases = {
                "A+B",
                "A+B*C",
                "(A+B)*C",
                "A+B*C-D/E",
                "A+B^C",
                "(A+B)^C",
                "((A+B)*C-D)/E",
                "A*(B+C/D^E)-F",
                "A+B*C-D/E^F",
                "A"
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println(InfixToPrefixConverter(testCases[i]));
        }
    }
}