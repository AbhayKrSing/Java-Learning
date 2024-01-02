public class SearchRotatedSortedArray {

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // public static int bs(int nums[], int si, int ei, int target) {
    // int mid = (si + ei) / 2;
    // if (nums[mid] == target) { // base case
    // return mid;
    // } else if (target < nums[mid]) {
    // return bs(nums, si, mid - 1, target);
    // } else {
    // return bs(nums, mid + 1, ei, target);
    // }
    // }

    public static int gettarget(int arr[], int si, int ei, int target) {
        if (si > ei) { // base case
            return -1;
        }
        int mid = (si + ei) / 2;
        if (arr[mid] == target) { // kaam
            return mid;
        } else if (arr[si] <= arr[mid] && (arr[si] <= target && target <= arr[mid])) { // left sorted and you find
                                                                                       // element
                                                                                       // on
                                                                                       // left
            return gettarget(arr, si, mid - 1, target);
        } else if (arr[si] <= arr[mid] && !(arr[si] <= target && target <= arr[mid])) { // left sorted and element is on
                                                                                        // right
            return gettarget(arr, mid + 1, ei, target);
        } else if (arr[mid] <= arr[ei] && (arr[mid] <= target && target <= arr[ei])) { // right sorted and you find
                                                                                       // element
                                                                                       // on right
            return gettarget(arr, mid + 1, ei, target);
        } else { // right sorted but element is on left
            return gettarget(arr, si, mid - 1, target);
        }

    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 8, 9, 0, 1, 2 };
        int target = 1;
        System.out.println(gettarget(nums, 0, nums.length - 1, target));

    }
}
