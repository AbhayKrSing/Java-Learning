package DivideAndConqueror;

public class QuickSort {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quicksort(int arr[], int si, int ei) {
        // base case
        if (ei <= si) {
            return;
        }
        // kaam(partition(partition se position pata chalti hai pivot element ki))
        int pivot = ei; // get pivot index
        int i = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < arr[pivot]) {
                // swapping
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // find position of pivot
        i++; // position of pivot
        int temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;
        // fn call
        quicksort(arr, si, i - 1); // left
        quicksort(arr, i + 1, ei); // right

    }

    public static void main(String[] args) {
        int nums[] = { 6, 3, 9, 8, 2, 5 };
        quicksort(nums, 0, nums.length - 1);
        printarray(nums);
    }

}