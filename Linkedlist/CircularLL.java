package Linkedlist;

public class CircularLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node last;

    public void printLL() {
        if (last == null) {
            System.err.println("LL is empty");
            return;
        }
        Node temp = last.next;
        while (temp != last) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("->" + last.next.data);

    }

    public void insertionBegining(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = newNode;
            return;
        }
        Node temp = last.next;
        last.next = newNode;
        newNode.next = temp;
    }

    public CircularLL() {

    }

    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.insertionBegining(3);
        cll.insertionBegining(2);
        cll.insertionBegining(1);

        cll.printLL();

    }
}