package Linkedlist;

public class ZigZag {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    public static Node head;
    public static Node tail;

    public static void printLL() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node getMid(Node head) {
        if (head == null) {
            System.out.println("LL is empty");
        }
        if (head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node reverseSecondHalf(Node mid) { // pass mid.next
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void zigZagLL(Node head) {
        Node mid = getMid(head);
        Node Last = reverseSecondHalf(mid);
        Node lh = head;
        Node rh = Last; // if you don't want to use tail pointer.
        // Node rh=tail;

        Node nextLh;
        Node nextRh;

        while (lh != null && rh != null) {
            nextLh = lh.next;
            lh.next = rh;
            nextRh = rh.next;
            rh.next = nextLh;
            lh = nextLh; // updating
            rh = nextRh;
        }
    }

    public static void main(String[] args) {
        ZigZag z = new ZigZag();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        tail = head.next.next.next.next;
        printLL();

        z.zigZagLL(head);
        printLL();
    }
}
