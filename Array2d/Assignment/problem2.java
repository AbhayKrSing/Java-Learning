public class problem2 {
    public static void main(String[] args) {
        int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } }; // u can also make uneven 2d array but it must
                                                                   // not be matrix.
        int sum = 0;
        for (int i = 0; i < nums[1].length; i++) {
            sum += nums[1][i];
        }
        System.out.println(sum);
    }
}
