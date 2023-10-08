package RotateArray;

public class rotateArrayleft2 {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Right rotate(Optimal approach) --> O(n+k): n=nums.length.
    public static void rotateArray(int nums[], int k) {
        int count = 1;
        for (int i = 0; i < k / 2; i++) { // reversal upto k-1;
            int temp = nums[i];
            nums[i] = nums[k - i - 1];
            nums[k - i - 1] = temp;
        }
        for (int i = k; i < (nums.length + k) / 2; i++) { // reversal after k-1
            int temp = nums[i];
            nums[i] = nums[nums.length - count];
            nums[nums.length - count] = temp;
            count++;
        }
        for (int i = 0; i < nums.length / 2; i++) { // again whole reversal
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 7, 5, 2, 11, 2, 43, 1, 1 };
        int k = 3;
        rotateArray(nums, k);
        printArray(nums);
    }
}
