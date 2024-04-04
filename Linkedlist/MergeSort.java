package Linkedlist;

public class MergeSort {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    public void AddFirst(int data) { // You can remove static becoz main fn is static and static fn only call
                                     // static fn [ TC--> O(1) ]
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void printLL() { // [TC --> O(n)]
        if (head == null) {
            System.out.println("Linked List is empty");
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
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    public Node merge(Node leftHead, Node rightHead) {
        Node mergeLL = new Node(Integer.MIN_VALUE);
        Node temp = mergeLL;
        while (rightHead != null && leftHead != null) {
            if (leftHead.data <= rightHead.data) {
                temp.next = leftHead;
                temp = leftHead;
                leftHead = leftHead.next;
            } else {
                temp.next = rightHead;
                temp = rightHead;
                rightHead = rightHead.next;
            }
        }
        // filling up remaining
        while (leftHead != null) {
            temp.next = leftHead;
            temp = leftHead;
            leftHead = leftHead.next;
        }
        while (rightHead != null) {
            temp.next = rightHead;
            temp = rightHead;
            rightHead = rightHead.next;
        }
        return mergeLL.next;

    }

    public Node mergeSort(Node head) {
        if (head.next == null) {
            return head;
        }
        // getMid Node
        Node mid = getMid(head);

        // break(divide)
        Node rightHead = mid.next;
        Node leftHead = head;
        mid.next = null;
        Node LH = mergeSort(leftHead);
        Node RH = mergeSort(rightHead);

        // merge
        return merge(LH, RH);

    }

    public static void main(String[] args) {
        MergeSort ll = new MergeSort();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.AddFirst(5);

        ll.printLL();

        head = ll.mergeSort(head);
        ll.printLL();

    }
}
