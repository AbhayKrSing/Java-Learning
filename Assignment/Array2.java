package Assignment;

import java.util.Arrays;

public class Array2 {
    public static int checkTarget(int nums[], int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[start] == target || nums[end] == target) { // corner condition.
                if (nums[start] == target) {
                    return start;
                } else {
                    return end;
                }
            }
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        if (nums[start] == target) {
            return start;
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 6;
        System.out.println(checkTarget(nums, target));

    }
}
