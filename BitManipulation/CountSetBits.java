public class CountSetBits {
    public static int countsetbits(int num) {
        int count = 0;
        // while (num > 0) {
        // if (num % 2 != 0) { //In bits prefer not use maths
        // count++;
        // }
        // num = (num >> 1);
        // }
        // return count;
        while (num > 0) {
            if ((num & 1) != 0) { // checking LSB
                count++;
            }
            num = (num >> 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 15;
        System.out.println(countsetbits(num));
    }
}
