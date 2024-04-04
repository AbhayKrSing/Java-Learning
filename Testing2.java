class Testing2 {
    static int count = 0;

    public static void counting(int nums[], int start, int mid, int end) {
        int fp = start;
        int sp = mid + 1;
        while (fp <= mid && sp <= end) {
            if (nums[fp] > 2 * nums[sp]) {
                count += mid - fp + 1;
                sp++;
            } else {
                fp++;
            }
        }
    }

    public static void mergeAndSort(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int fp = start;
        int sp = mid + 1;
        int k = 0;
        while (fp <= mid && sp <= end) {
            if (nums[fp] < nums[sp]) {
                temp[k] = nums[fp];
                fp++;
            } else {
                temp[k] = nums[sp];
                sp++;
            }
            k++;
        }
        while (fp <= mid) {
            temp[k] = nums[fp];
            fp++;
            k++;
        }
        while (sp <= end) {
            temp[k] = nums[sp];
            sp++;
            k++;
        }
        // copying from temp[] to original[]
        for (int i = 0, j = start; j <= end; i++, j++) {
            nums[j] = temp[i];
        }
    }

    public static void getReversePair(int[] nums, int start, int end) {
        // base case
        if (start >= end) {
            return;
        }
        // Fn call and work
        int mid = (start + end) / 2;
        getReversePair(nums, start, mid);
        getReversePair(nums, mid + 1, end);

        counting(nums, start, mid, end);

        mergeAndSort(nums, start, mid, end);

    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 3, 5, 1 };
        getReversePair(nums, 0, nums.length - 1);
        System.out.println(count);
    }
}