package Linkedlist;

public class Test {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void AddFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void AddLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void DeleteN_Nodes_After_M_Nodes(int m, int n) {
        Node fp = head;
        Node sp = head;

        while (fp != null && sp != null) {
            int M = m;
            while (M > 1) {
                fp = fp.next;
                M--;
            }
            int num = m + n;
            while (num > 1) {
                sp = sp.next;
                num--;
            }

            fp.next = sp.next;
            fp = fp.next;
            sp = fp;
        }

    }

    public static void main(String[] args) {
        Test ll = new Test();
        ll.AddLast(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.AddLast(6);
        ll.AddLast(7);
        ll.AddLast(8);
        ll.AddLast(9);
        ll.AddLast(10);

        ll.printLL();

        ll.DeleteN_Nodes_After_M_Nodes(3, 2);

        ll.printLL();

    }
}