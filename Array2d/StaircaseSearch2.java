package Array2d;

public class StaircaseSearch2 {
    public static boolean StaircaseSearch_on_sortedmatrix(int[][] arr, int key) {
        int i = arr.length - 1;
        int j = 0;
        while (j <= arr[0].length - 1 && i >= 0) {
            if (key == arr[i][j]) {
                System.out.println("key is at index :" + "(" + i + "," + j + ")");
                return true;
            } else if (key > arr[i][j]) {
                j++;
            } else {
                i--;
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
