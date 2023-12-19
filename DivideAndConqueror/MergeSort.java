package DivideAndConqueror;

public class MergeSort {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int[] arr, int si, int ei, int mid) {
        int firstp = si; // iterator for left part
        int secondp = mid + 1; // iterator for right part
        int temp[] = new int[ei - si + 1];
        int k = 0;
        while (firstp <= mid && secondp <= ei) {
            if (arr[firstp] < arr[secondp]) {
                temp[k] = arr[firstp];
                firstp++;
            } else {
                temp[k] = arr[secondp];
                secondp++;
            }
            k++;
        }
        // fill leftout elements
        while (firstp <= mid) {
            temp[k] = arr[firstp];
            firstp++;
            k++;
        }
        while (secondp <= ei) {
            temp[k] = arr[secondp];
            secondp++;
            k++;
        }
        // copying temporary array into original
        for (int i = si, p = 0; i <= ei; i++, p++) {
            arr[i] = temp[p];
        }

    }

    public static void mergesort(int[] arr, int si, int ei) {
        if (si >= ei) { // base case
            return;
        }
        int mid = (si + ei) / 2;
        mergesort(arr, si, mid); // left //fn call
        mergesort(arr, mid + 1, ei);// right //fn call

        // kaam(sort and merge)
        merge(arr, si, ei, mid); // merging
    }

    public static void main(String[] args) {
        int nums[] = { 6, 3, 9, 5, 2, 8 };
        mergesort(nums, 0, nums.length - 1);
        printarray(nums);
    }
}