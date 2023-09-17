public class GetithBit {
    // public static void getithBit(int num, int i) { //lekin hame left shift
    // approach se karna padega
    // int bitmask = 1;
    // for (int j = 0; j <= i; j++) { // getting bitmask ready
    // bitmask = bitmask * 10;
    // }
    // System.out.println(bitmask);
    // if (bitmask != 0) {
    // System.out.println(i + "th bit is " + 1);
    // } else {
    // System.out.println(i + "th bit is " + 0);
    // }
    // }

    public static int getithBit(int num, int i) {
        int bitmask = 1 << i;
        if ((num & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int nums = 10;
        int i = 3;
        System.out.println(i + " th bit is " + getithBit(nums, i));
    }
}
