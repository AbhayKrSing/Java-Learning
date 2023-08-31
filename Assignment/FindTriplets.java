package Assignment;

public class FindTriplets {
    public static int[] ReturnTriplets(int[] arr) {
        int length = arr.length;
        int[][] newarr;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        int[] temp = { arr[i], arr[j], arr[k] };
                        // newarr[k][j] = temp;
                    }
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        ReturnTriplets(nums);
    }
}
