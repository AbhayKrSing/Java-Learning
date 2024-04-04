package Linkedlist;

import java.util.LinkedList; //Java collection framework

public class InBuilt {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addFirst(3);
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);
    }
}
