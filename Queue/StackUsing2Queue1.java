package Queue;

import java.util.*;

public class StackUsing2Queue1 { // pop O(n)
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data) {
            if (!q2.isEmpty()) {
                q2.add(data);
                return;
            }
            q1.add(data);
        }

        public int pop() { // O(n)
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (!q1.isEmpty()) {
                        q2.add(top);
                    } else {
                        break;
                    }
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (!q2.isEmpty()) {
                        q1.add(top);
                    } else {
                        break;
                    }
                }
            }
            return top;
        }

        public int peek() { // O(n)
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.err.println(s.peek());
            s.pop();
        }

    }
}