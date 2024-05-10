package Stack;

import java.util.Stack;

public class ReverseAStack {
    public static void pushAtbottom(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtbottom(st, data);
        st.push(top);
    }

    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        reverse(st);
        pushAtbottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.err.println(st);
        reverse(st);
        System.out.println(st);
    }
}
