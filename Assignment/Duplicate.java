package Assignment;

import java.util.Arrays;

public class Duplicate {
    public static boolean checkDuplicate(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(checkDuplicate(nums));
        ;
    }
}
