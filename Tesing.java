import java.util.Arrays;

public class Tesing {

    public static void main(String[] args) {
        int nums[] = { 1, 2 };
        int i = 0;
        for (int j = i; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(i + 1);
        ;
    }
}