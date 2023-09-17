
public class BubbleSort {
    public static void BubbleSorting(int arr[]) { // Its time complexity is always O(n^2) even for the best case,that is
                                                  // why i use swapping here.
        int size = arr.length;
        for (int turn = 0; turn <= size - 2; turn++) {
            int swap = 0; // swap variable is used to make this algo time complexity O(n) for best use
                          // case i.e for sorted array
            for (int j = 0; j <= size - 2 - turn; j++) {
                if (arr[j] > arr[j + 1]) { // swapping ---> for decresing order just change sign to <
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };
        BubbleSorting(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
