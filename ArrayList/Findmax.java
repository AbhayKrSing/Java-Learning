package ArrayList;

import java.util.ArrayList;

public class Findmax {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(67);
        arr.add(89);
        arr.add(34);
        arr.add(90);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
        }
        System.out.println(max);
    }
}
