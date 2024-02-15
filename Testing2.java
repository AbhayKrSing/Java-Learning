
public class Testing2 {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void nextPermutation(int[] nums) {
        // finding breakPoint
        int bp = -1;
        // k variable for reversing last step
        int k = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) { // breakpoint
                bp = i;
                break;
            }
        }
        if (bp == -1) { // for no break point
            for (int i = 0; i < nums.length / 2; i++) {
                int temp = nums[i];
                nums[i] = nums[nums.length - i - 1];
                nums[nums.length - i - 1] = temp;
            }
            return;
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] > nums[bp]) {
                // swap
                int temp = nums[bp];
                nums[bp] = nums[j];
                nums[j] = temp;
                break;
            }
        }
        // reversing
        for (int i = bp + 1; i <= (nums.length + bp) / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
            k--;
        }

    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 2 };
        nextPermutation(nums);
        printArray(nums);
    }
}