package Linkedlist;

public class LinkedList {
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

    public void AddFirst(int data) { // You can remove static becoz main fn is static and static fn only call
                                     // static fn [ TC--> O(1) ]
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void AddLast(int data) { // [TC --> O(1)]
        Node newNode = new Node(data);
        size++;
        if (head == null) { // by convection if head==null then it means there is no LL.(You can also use
                            // tail==null here)
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLL() { // [TC --> O(n)]
        // if (head == null) {
        // System.out.println("Linked List is empty");
        // return;
        // }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data) {
        if (index == 0) { // because in this we are also handling head pointer.
            AddFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i != index - 1) {
            temp = temp.next;
            i++;
        }
        // i=index-1 ; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty nothing to remove");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            size = 0;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        Node temp = head;
        if (size == 0) {
            System.out.println("LL is empty nothing to remove");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            size = 0;
            tail = head = null;
            return val;
        }
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        Node prev = temp;
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int iterSearch(int key) { // will return idx [TC-->O(n)]
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;

    }

    public int helper(int key, Node head) { // TC & SC O(n).
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(key, head.next);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(key, head);
    }

    public void reverse() { // O(n)
        // need to change tail and head both
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthFromLast(int n) {
        // to cal size
        // int sz = 0;
        // Node temp = head;
        // while (temp != null) {
        // temp = temp.next;
        // sz++;
        // }

        Node prev = head;
        if (n == size) {
            head = prev.next;
        }
        for (int i = 0; i < size - n - 1; i++) {
            prev = prev.next;
        }
        Node rmv = prev.next;
        prev.next = rmv.next;
    }

    public boolean checkPalindrome() {
        // before all steps, put some boundary condn
        if (head == null || head.next == null) {
            return true;
        }
        // Step-1 get midNode(using fast slow approach)
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Step-2 reverse 2nd half
        Node curr = slow;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // Step-3 check if 1st half is equal to second half or not(palindrome condn)
        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static Node detectCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return fast;
    }

    public static void removeCycle(Node head) {
        // detecting cycle
        Node result = detectCycle();
        if (result == null) {
            System.out.println("LL is not cyclic");
            return;
        }
        // slow=head (finding meeting point)
        Node slow = head;
        Node fast = result;
        Node prev = null;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        // prev mark to null to break cycle
        prev.next = null;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.printLL();
        // ll.AddFirst(2);
        // ll.printLL();
        // ll.AddFirst(1);
        // ll.printLL();
        // ll.AddLast(3);
        // ll.printLL();
        // ll.AddLast(4);
        // ll.printLL();
        // ll.add(2, 9);
        // ll.printLL();

        // ll.removeFirst();
        // ll.printLL();

        // ll.removeLast();
        // ll.printLL();

        // System.out.println("Key is at index :" + ll.iterSearch(3));
        // System.out.println("Key is at index :" + ll.iterSearch(10));

        // System.out.println("Key is at index :" + ll.recSearch(3));
        // System.out.println("Key is at index :" + ll.recSearch(10));

        // ll.reverse();
        // ll.printLL();

        // ll.removeNthFromLast(5);
        // ll.printLL();

        // To check palindrome condn we are making ll
        // ll.AddLast(1);
        // ll.AddLast(2);
        // ll.AddLast(1);
        // ll.AddLast(2);
        // ll.AddLast(1);

        // System.out.println(ll.checkPalindrome());

        // To check isCycle method for detecting cyclic in LL
        // 1 way to do this.
        // Node head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head; // 1->2->3->1

        // System.out.println(isCycle(head));

        // 2 way to do this
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; // 1->2->3->2

        System.out.println(isCycle());
        removeCycle(head);
        System.out.println(isCycle());
    }
}
