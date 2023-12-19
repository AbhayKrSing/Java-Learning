public class Testing2 {
    public static void printArry(int[] nums, int si, int ei) {
        for (int i = si; i < ei + 1; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static int maxSubArray(int[] nums) {
        int cs = 0;
        int start = -1;
        int end = -1;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (cs == 0) {
                start = i;
            }
            cs += nums[i];
            if (cs > maxSum) {
                maxSum = cs;
                end = i;
            }
            if (cs < 0) {
                cs = 0;
            }
        }
        printArry(nums, start, end);
        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(maxSubArray(nums));
    }
}