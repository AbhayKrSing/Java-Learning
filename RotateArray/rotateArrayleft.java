package RotateArray;

public class rotateArrayleft {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Overall of timecomplexity O(k)+O(n-k)+O(k)=O(n+k) :nums.length=n; (Better
    // approach)
    public static void RotateArray(int nums[], int k) {
        k = k % nums.length;
        int temp[] = new int[k]; // use extra space so its space complexity is O(k) (So we have to optimsed this
                                 // further)
        int count = 0;
        for (int i = 0; i < temp.length; i++) { // making temp array
            temp[i] = nums[i];
        }
        for (int i = k; i < nums.length; i++) { // main logic for left shift
            nums[i - k] = nums[i];
            count++;
        }
        for (int i = count; i < nums.length; i++) {
            nums[i] = temp[i - count];
        }

    }

    public static void main(String[] args) {
        int nums[] = { 7, 5, 2, 11, 2, 43, 1, 1 };
        int k = 5;
        RotateArray(nums, k);
        printArray(nums);
    }
}
