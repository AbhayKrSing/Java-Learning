package Assignment2;

public class CountSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void CountSorting(int arr[]) {
        // 1. find the maximum element for range.
        int max = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        // 2. make Count array using largest element.
        int countArray[] = new int[max + 1];
        for (int i = 0; i < n; i++) { // making counting array
            countArray[arr[i]]++;
        }
        int j = 0;
        for (int i = countArray.length - 1; i >= 0; i--) { // for decreasing order
            while (countArray[i] > 0) {
                arr[j] = i;
                countArray[i]--;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        CountSorting(nums);
        printArray(nums);

    }
}
