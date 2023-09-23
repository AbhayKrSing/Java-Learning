public class ClearLastithbit {
    // public static int clearithbit(int num, int i) {
    // int bitmask = ~(1 << i); //Bad algo
    // return num & bitmask;
    // }

    // public static int clearLastithbit(int num, int ith) {
    // int newnum = num;
    // for (int i = 0; i <= ith; i++) {
    // newnum = clearithbit(newnum, i);
    // }
    // return newnum;
    // }
    public static int clearLastithbit(int num, int ith) {
        int bitmask = -1 << ith + 1; // -1= (~0)
        return num & bitmask;
    }

    public static void main(String[] args) {
        int nums = 15;
        int i = 2;
        System.out.println(clearLastithbit(nums, i));
        ;
    }
}
