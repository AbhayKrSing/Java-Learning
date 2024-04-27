package Linkedlist;

public class DoubleLL {
    public static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    public void removeLast() {
        if (head == null) { // if LL is empty
            System.out.println("LL empty");
            return;
        }
        if (head.next == null) { // if only one dll is present
            head = tail = null;
            size--;
            return;
        }

        tail = tail.prev;
        tail.next = null;
        size--;

    }

    public void removeFirst() {
        if (head == null) { // if LL is empty
            System.out.println("LL empty");
            return;
        }
        if (head.next == null) { // if only one dll is present
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void reversedLL() {
        if (size == 0) {
            System.out.println("LL is empty");
            return;
        }
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        tail = head;
        head = prev;
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(5);
        dll.printLL();
        // dll.removeLast();
        // dll.printLL();

        // dll.removeFirst();
        // dll.printLL();

        dll.reversedLL();
        dll.printLL();
    }
}
