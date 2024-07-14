package Queue;

import java.util.*;

public class InBuiltImplementation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Here Queue is a interface that is why you can't directly make an object out
        // of it.We can use class like ArrayDeque and LinkedList which using Queue
        // interface from its implementation
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }

    }
}
