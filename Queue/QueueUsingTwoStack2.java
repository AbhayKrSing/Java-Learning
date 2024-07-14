package Queue;

import java.util.Stack;

public class QueueUsingTwoStack2 {
    static class Queue {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        public boolean isEmpty() {
            return st1.isEmpty();
        }

        public void add(int data) {
            st1.push(data);
        }

        public int remove() { // O(n)
            if (st1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
            int result = st2.pop();
            while (!st2.isEmpty()) {
                st1.push(st2.pop());
            }
            return result;
        }

        public int peek() { // O(n)
            if (st1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
            int result = st2.peek();
            while (!st2.isEmpty()) {
                st1.push(st2.pop());
            }
            return result;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
