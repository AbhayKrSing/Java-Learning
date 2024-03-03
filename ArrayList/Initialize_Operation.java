package ArrayList;

import java.util.ArrayList;

public class Initialize_Operation {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>(); // not used to store premitive data type
        ArrayList<String> str = new ArrayList<>();
        ArrayList<Boolean> condn = new ArrayList<>();

        // add element O(1)
        lst.add(3);
        lst.add(5);
        lst.add(6);
        System.out.println(lst);

        lst.add(1, 2);
        System.out.println(lst);

        // get element O(1)
        System.out.println(lst.get(2));

        // remove element O(n)
        lst.remove(1);
        System.out.println(lst);

        // set element O(n)
        lst.set(2, 10);
        System.out.println(lst);

        // contains element O(n)
        System.out.println(lst.contains(8));
        System.out.println(lst.contains(3));
    }
}
