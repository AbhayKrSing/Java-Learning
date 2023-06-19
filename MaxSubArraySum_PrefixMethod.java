public class MaxSubArraySum_PrefixMethod {
    public static int PrefixSubArraySum(int arr[]) {
        int PrefixArray[] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;
        int SumOfeachSubArray;
        PrefixArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) { // for making prefix array
            PrefixArray[i] = PrefixArray[i - 1] + arr[i];
        }
        for (int i = 0; i < PrefixArray.length; i++) {
            for (int j = i; j < PrefixArray.length; j++) {
                SumOfeachSubArray = i == 0 ? PrefixArray[j] : PrefixArray[j] - PrefixArray[i - 1]; // carfully check at
                                                                                                   // of i=0 condition..
                System.out.println(SumOfeachSubArray);
                if (SumOfeachSubArray > maxSum) {
                    maxSum = SumOfeachSubArray;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 1, -3 };
        System.out.println("Max sum in all sub Array is " + PrefixSubArraySum(arr));

    }
}
