package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class StackImplementationUsingDeque {
    static class Stack {
        Deque<Integer> dq = new LinkedList<>();

        public boolean isEmpty() {
            return dq.isEmpty();
        }

        public void push(int data) {
            dq.addLast(data);
        }

        public int pop() {
            return dq.removeLast();
        }

        public int peek() {
            return dq.getLast();
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
