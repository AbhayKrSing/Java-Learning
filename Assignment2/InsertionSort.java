package Assignment2;

public class InsertionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void InsertionSorting(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int prev = i;
            int curr = arr[i + 1]; // act as a temporary store.
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                // arr[prev] = curr; //Either do this
                prev--;
            }
            arr[prev + 1] = curr; // or do this (yeh wala jada optimised hai)
        }
    }

    public static void main(String[] args) {
        int nums[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        InsertionSorting(nums);
        printArray(nums);
    }
}