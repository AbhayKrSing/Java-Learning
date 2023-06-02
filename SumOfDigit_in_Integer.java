public class SumOfDigit_in_Integer {
    public static int sum_of_No_In_integers(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum_of_No_In_integers(14657));
    }
}
