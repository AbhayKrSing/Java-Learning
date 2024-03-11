package ArrayList;

import java.util.ArrayList;

public class Size {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(6);
        lst.add(10);
        lst.add(5);
        System.out.println(lst);
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i) + " ");
        }
        System.out.println();
    }
}
