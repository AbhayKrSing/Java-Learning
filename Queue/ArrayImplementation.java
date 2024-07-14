package Queue;

public class ArrayImplementation {
    static class Queue {
        static int rear;
        static int size;
        static int[] arr;

        public Queue(int n) {
            size = n;
            arr = new int[n];
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Fully packed");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public int remove() {
            // front is always at 0;
            if (isEmpty()) {
                System.out.println("Queue is already empty");
                return -1; // for char etc return like '@'
            }
            int front = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int isPeek() {
            if (isEmpty()) {
                System.out.println("Queue is empty my friend");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(3);
        q.add(2);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
