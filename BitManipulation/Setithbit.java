public class Setithbit {
    public static int setithbit(int num, int i) {
        int bitmask = 1 << i;
        int newNo = num | bitmask;
        return newNo;
    }

    public static void main(String[] args) {
        int nums = 10;
        int i = 2;
        System.out.println(setithbit(nums, i));
    }
}