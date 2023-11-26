package Recursion.Assignment;

public class Que1 {
    public static void fn(int[] nums, int i, int key) {
        if (i == nums.length) {
            return;
        }
        if (nums[i] == key) {
            System.out.print(i + " ");
        }
        fn(nums, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        fn(arr, 0, key);
    }
}
