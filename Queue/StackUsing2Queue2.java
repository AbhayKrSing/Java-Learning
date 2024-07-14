package Queue;

import java.util.*;

public class StackUsing2Queue2 {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data) {
            if (q1.isEmpty()) {
                q1.add(data);
                while (!q2.isEmpty()) {
                    q1.add(q2.remove());
                }
            } else {
                q2.add(data);
                while (!q1.isEmpty()) {
                    q2.add(q1.remove());
                }
            }
        }

        public int pop() {
            if (!q1.isEmpty()) {
                return q1.remove();
            } else {
                return q2.remove();
            }
        }

        public int peek() {
            if (!q1.isEmpty()) {
                return q1.peek();
            }
            return q2.peek();
        }

    }

    public static void main(String[] args) { // push O(n)
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
