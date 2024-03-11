package ArrayList;

import java.util.ArrayList;

public class MultiDimenArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainLst = new ArrayList<>();
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(2);
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(3);
        lst2.add(4);
        mainLst.add(lst1);
        mainLst.add(lst2);
        System.out.println(mainLst);

        for (int i = 0; i < mainLst.size(); i++) {
            ArrayList<Integer> currentLst = mainLst.get(i);
            for (int j = 0; j < currentLst.size(); j++) {
                System.out.print(currentLst.get(j) + " ");
            }
            System.out.println();
        }

    }
}
