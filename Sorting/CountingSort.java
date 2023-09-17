
public class CountingSort {
    public static void CountingSorting(int arr[]) {
        // 1st find maximum element in arr for setting up an range
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int countingArray[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) { // storing frequency on Counting array.
            countingArray[arr[i]]++;
        }
        PrintArray(countingArray);
        System.out.println();
        // sorting array
        int j = 0;
        for (int i = 0; i < countingArray.length; i++) { // mujhe laga tha ki do(loop) nhi chalana hai.
            while (countingArray[i] > 0) {
                arr[j] = i;
                countingArray[i]--;
                j++;
            }
        }
    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 4, 1, 3, 2, 4, 3, 7 }; // This is only for positive numbers
        CountingSorting(nums);
        PrintArray(nums);
    }
}
