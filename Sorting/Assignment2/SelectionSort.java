package Assignment2;

public class SelectionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void SelectionSorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int largest = i; // largest position
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[largest]) {
                    largest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        SelectionSorting(nums);
        printArray(nums);
    }
}
