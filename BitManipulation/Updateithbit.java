public class Updateithbit {
    public static int setithbit(int num, int i) {
        int bitmask = 1 << i;
        int result = num | bitmask;
        return result;
    }

    public static int clearithbit(int num, int i) {
        int bitmask = ~(1 << i);
        int result = num & bitmask;
        return result;
    }

    public static void main(String[] args) {
        int val = 0;
        int i = 2;
        int num = 10;
        if (val == 1) {
            System.out.println(setithbit(num, i));
            ;
        } else if (val == 0) {
            System.out.println(clearithbit(num, i));
        }
    }
}
