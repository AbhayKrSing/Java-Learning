package DivideAndConqueror.Assignment;

public class Que2_2 { // greater than n/2 means that particular element occurs most of the times in an
                      // array.
    public static int countEle(int arr[], int si, int ei, int num) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int giveMajorityEle(int[] nums, int si, int ei) {
        if (si >= ei) { // base case
            return nums[si];
        }
        int mid = (si + ei) / 2;
        int left = giveMajorityEle(nums, si, mid); // fn call
        int right = giveMajorityEle(nums, mid + 1, ei);
        // kaam
        if (left == right) { // If left half majority element is same as right half
            return left;
        }
        // else
        int countLeftMajorityEle = countEle(nums, si, ei, left); // for left ele
        int countRightMajorityELe = countEle(nums, si, ei, right); // for right ele

        return countLeftMajorityEle > countRightMajorityELe ? left : right;

    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 3 };
        System.out.println(giveMajorityEle(nums, 0, nums.length - 1));
        ;

    }

}
