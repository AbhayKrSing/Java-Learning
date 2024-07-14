package Queue;

import java.util.Stack;

public class QueueUsingTwoStack1 {
    static class Queue {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        public boolean isEmpty() {
            return st1.isEmpty();
        }

        public void add(int data) { // O(n)
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
            st1.push(data);
            while (!st2.isEmpty()) {
                st1.push(st2.pop());
            }
        }

        public int remove() {
            if (st1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return st1.pop();
        }

        public int peek() {
            if (st1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return st1.peek();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        // while (!q.isEmpty()) {
        // System.out.println(q.remove());
        // }
        System.out.println(q.st1);

        Queue q1 = new Queue();
        q1.add(4);
        q1.add(5);
        // while (!q1.isEmpty()) {
        // System.out.println(q1.remove());
        // }
        System.out.println(q1.st1);

    }
}