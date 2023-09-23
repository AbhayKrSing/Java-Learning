public class checkNois2PowerOrNot {
    public static boolean is2PowerOrNot(int num) {
        if ((num & num - 1) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println(is2PowerOrNot(num));
    }
}
