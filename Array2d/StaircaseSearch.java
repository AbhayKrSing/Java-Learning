package Array2d;

public class StaircaseSearch {
    public static boolean StaircaseSearch_on_sortedmatrix(int[][] arr, int key) {
        int i = 0;
        int j = arr[0].length - 1;
        while (i <= arr.length - 1 && j >= 0) { // condn specify that if it transverse to other corner and haven't find
                                                // an element then we need to exist.
            if (key < arr[i][j]) {
                j--;
            } else if (key > arr[i][j]) {
                i++;
            } else if (key == arr[i][j]) {
                System.out.println("key is at index :" + "(" + i + "," + j + ")");
                return true;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int nums[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        StaircaseSearch_on_sortedmatrix(nums, 33);
    }
}