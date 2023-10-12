public class Testing {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void leftshiftby1place(int nums[], int k) {
        for (int i = k; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = 0;
    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                leftshiftby1place(nums, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1 };
        moveZeroes(arr);
        printArray(arr);
    }

}