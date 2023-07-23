public class test {
    public static int binarySearch(int nums[], int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int findTarget(int nums[], int target) {
        int n = nums.length;
        int start = -1;
        int end2 = n - 1;
        int end1 = 0;
        int result;
        if (n == 1) { // for single element array
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        for (int i = 0; i < n - 1; i++) { // To check part from where it is unsorted.
            if (nums[i] > nums[i + 1]) {
                start = i + 1;
                break;
            } else if (i + 1 == n - 1) { // when no rotation done.
                result = binarySearch(nums, target, 0, n - 1);
                if (result > -1) {
                    return result;
                } else {
                    return result;
                }
            }
        }
        // when rotation done
        if (nums[start] <= target && target <= nums[end2]) {
            result = binarySearch(nums, target, start, end2);
            if (result > -1) {
                return result;
            }
        } else {
            result = binarySearch(nums, target, end1, start - 1);
            if (result > -1) {
                return result;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findTarget(nums, 0));
    }

}