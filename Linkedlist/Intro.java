package Linkedlist;

public class Intro {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        Intro LinkedList = new Intro();
        LinkedList.head = new Node(0);
        LinkedList.head.next = new Node(1);
    }
}
