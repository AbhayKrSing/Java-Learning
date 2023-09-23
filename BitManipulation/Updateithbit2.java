public class Updateithbit2 {
    public static int clearithbit(int num, int i) {
        int bitmask = ~(1 << i);
        int result = bitmask & num;
        return result;
    }

    public static int Updateithbit(int num, int i, int newbit) {
        int n = clearithbit(num, i);
        int bitmask = newbit << i;
        int result = n | bitmask;
        return result;
    }

    public static void main(String[] args) {
        int num = 13;
        int i = 2;
        System.out.println(Updateithbit(num, i, 0));
        System.out.println(Updateithbit(num, i, 1));

    }
}
