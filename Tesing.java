
public class Tesing {
    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int i = 2;
        for (int j = i; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i] = nums[j];
                i++;
            } else if (nums[i] != nums[i - 2]) {
                i++;
            }
        }
        printArray(nums);
        return i;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 2, 2, 2, 2, 3, 4, 4, 4 };
        removeDuplicates(nums);
    }

}