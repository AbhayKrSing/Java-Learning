package DivideAndConqueror.Assignment;

public class Que2 {
    public static int getmaximum(int[] nums) {
        int ele = nums[0];
        int count = 1;
        ;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                ele = nums[i];
                count++;
            }
            if (ele == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return ele;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 3 };
        System.out.println(getmaximum(nums));
        ;
    }

}