public class clearRangeofithBit {
    // public static int ClearRangeofithBit(int num, int ith, int jth) { // Algo 1
    // int bitmask = (~(-1 << ith)) | (-1 << jth + 1);
    // int result = num & bitmask;
    // return result;
    // }
    // public static int ClearRangeofithBit(int num, int ith, int jth) {
    // int a = -1 << (jth + 1);
    // int b = (int) Math.pow(ith, 2) - 1; //another method to not use Math.pow()
    // int bitmask = a | b;
    // return num & bitmask;
    // }
    public static int ClearRangeofithBit(int num, int ith, int jth) {
        int a = -1 << (jth + 1); // -1=~0
        int b = (1 << ith) - 1;
        int bitmask = a | b;
        return num & bitmask;
    }

    public static void main(String[] args) {
        int num = 10;
        int i = 2;
        int j = 4;
        System.out.println(ClearRangeofithBit(num, i, j)); // 2307
        ;
    }
}
