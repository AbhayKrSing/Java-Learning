package ArrayList;

import java.util.ArrayList;

public class PrintReverse {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(67);
        arr.add(89);
        arr.add(34);
        arr.add(90);

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
