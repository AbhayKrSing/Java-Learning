
public class SelectionSort {
    // public static void SelectionSorting(int[] arr) { // This code snippet needs
    // // extra space due to declaration of new
    // // element named track & also we need to use Interger.MAX_VALUE here.
    // int n = arr.length;
    // int track = 0;
    // int temp;
    // for (int i = 0; i < n - 1; i++) {
    // int smallest = Integer.MAX_VALUE;
    // for (int j = i; j < n; j++) {
    // // smallest = Math.min(smallest, arr[j]);
    // if (smallest > arr[j]) {
    // smallest = arr[j];
    // track = j; // tracking smallest element position.
    // }
    // }
    // temp = arr[i];
    // arr[i] = smallest; // yeh bhi to track karna padega kise replace kiye ho.
    // arr[track] = temp;

    // }
    // }

    public static void SelectionSorting(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minPos = i; // suppose first element is min element in each turn ,we have
                            // done this to track
                            // minm element
                            // position.So that we will easily perform swapping
            for (int j = i + 1; j < n; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swapping with minm element
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printarray(int arr[]) { // for printing element present in array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };
        SelectionSorting(nums);
        printarray(nums);
    }
}