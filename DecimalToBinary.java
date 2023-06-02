public class DecimalToBinary {
    public static int decimalTobinary(int num) {
        int binaryNo = 0;
        for (int i = 0; num > 0; i++) {
            int binarydigit = num % 2;
            binaryNo += (binarydigit * Math.pow(10, i));
            num = num / 2;
        }
        return binaryNo;
    }

    public static void main(String[] args) {
        System.out.println(decimalTobinary(55));
    }
}