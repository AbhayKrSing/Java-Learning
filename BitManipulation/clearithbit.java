public class clearithbit {
    public static int Clearithbit(int num, int i) {
        int bitmask = 1 << i;
        // int not_of_num = ~num; // Abhay's logic
        // int result = not_of_num | bitmask;
        // result = ~result;
        // return result;
        bitmask = ~bitmask;
        return num & bitmask;
    }

    public static void main(String[] args) {
        int num = 10;
        int i = 1;
        System.out.println(Clearithbit(num, i));
    }
}
