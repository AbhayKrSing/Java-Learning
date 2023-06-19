public class Kadane_sAlgorithm {
    public static int maxSubArraySum(int arr[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            // else if (currentSum > maxSum) { //yeh bhi kar skte
            // maxSum = currentSum;
            // }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum subarray sum is " + maxSubArraySum(arr));

    }

}