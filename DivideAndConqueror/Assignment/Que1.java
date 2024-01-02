package DivideAndConqueror.Assignment;

public class Que1 {
    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int comparestring(String fst, String sec) {
        return fst.compareTo(sec);
    }

    public static void merge(String arr[], int si, int ei, int mid) {
        int i = si;
        int j = mid + 1;
        String temp[] = new String[arr.length];
        int k = 0; // for temp arr
        while (i <= mid && j <= ei) {
            if (comparestring(arr[i], arr[j]) > 0) {
                temp[k] = arr[j];
                j++;
            } else {
                temp[k] = arr[i];
                i++;
            }
            k++;
        }
        // copying leftout element
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ei) {
            temp[k] = arr[i];
            j++;
            k++;
        }
        // copying temp into original arr
        for (int k1 = si, k2 = 0; k1 <= ei; k2++, k1++) {
            arr[k1] = temp[k2];
        }
    }

    public static void mergesort(String arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);
        merge(arr, si, ei, mid);
    }

    public static void main(String[] args) {
        String nums[] = { "sun", "earth", "mercury", "mars" };
        mergesort(nums, 0, nums.length - 1);
        printArray(nums);
    }
}