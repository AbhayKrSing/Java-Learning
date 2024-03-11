package ArrayList;

public class TwopairSum {
    public static boolean pair2SumInSortedAndRotatedWithoutModulo(int nums[], int target) {
        int left = -1;
        int right = -1;
        // get pivot point
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                left = i;
                right = i - 1;
            }
        }
        while (left != right) {
            if (nums[left] + nums[right] > target) {
                if (right == 0) {
                    right = nums.length - 1;
                } else {
                    right--;
                }

            } else if (nums[left] + nums[right] < target) {
                if (left == nums.length - 1) {
                    left = 0;
                } else {
                    left++;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean pair2SumInSortedAndRotatedWithModulo(int nums[], int target) {
        int left = -1;
        int right = -1;
        // get pivot point
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                left = i;
                right = i - 1;
            }
        }
        while (left != right) {
            if (nums[left] + nums[right] > target) {
                right = (nums.length + right - 1) % nums.length;

            } else if (nums[left] + nums[right] < target) {
                left = (left + 1) % nums.length;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 11, 15, 6, 8, 9, 10 };
        int target = 17;
        System.out.println(pair2SumInSortedAndRotatedWithoutModulo(nums, target));
    }
}
