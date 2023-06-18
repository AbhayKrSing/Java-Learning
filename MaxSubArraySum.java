public class MaxSubArraySum {
    public static int maxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int eachSubArraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    eachSubArraySum += arr[k];
                }
                if (maxSum < eachSubArraySum) {
                    maxSum = eachSubArraySum;
                }
                System.out.println(eachSubArraySum);
                eachSubArraySum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int array[] = { 1, -2, 6, -1, 3 };
        System.out.println("Maximum subArray sum is " + maxSubArraySum(array));

    }
}