package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(67);
        arr.add(89);
        arr.add(34);
        arr.add(90);

        Collections.sort(arr); // Collection is a interface but Collections is class
        System.out.println(arr);
        Collections.sort(arr, Collections.reverseOrder()); // Collections.sort(arr,<Comparator fn>); Comparator fn is fn
                                                           // which define sorting logic.

    }
}