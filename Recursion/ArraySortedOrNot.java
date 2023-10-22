package Recursion;

public class ArraySortedOrNot {
    public static boolean checksortedarray(int nums[], int i) {
        if (i + 1 == nums.length) {
            return true;
        }
        if (nums[i] > nums[i + 1]) {
            return false;
        }
        return checksortedarray(nums, i + 1);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 4, 6 };
        System.out.println(checksortedarray(a, 0));
        ;
    }
}
