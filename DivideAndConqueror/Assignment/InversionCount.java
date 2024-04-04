package DivideAndConqueror.Assignment;

public class InversionCount {
    public static int count = 0; // global variable

    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void counter(int arr[], int siF, int siS, int mid, int ei) {
        while (siS <= ei && siF <= mid) { // todo:condn we will check later
            if (arr[siF] > arr[siS]) {
                count += mid - siF + 1;
                siS++;
            } else {
                siF++;
            }
        }
    }

    public static void mergeSort(int[] nums, int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = 0;
        int sp = mid + 1;
        int fp = si; // idhar bug tha
        while (fp <= mid && sp <= ei) {
            if (nums[fp] < nums[sp]) {
                temp[i] = nums[fp];
                fp++;
            } else {
                temp[i] = nums[sp];
                sp++;
            }
            i++;
        }

        while (fp <= mid) {
            temp[i] = nums[fp];
            fp++;
            i++;
        }
        while (sp <= ei) {
            temp[i] = nums[sp];
            sp++;
            i++;
        }
        // copying temp into original array
        for (int j = 0, k = si; k <= ei; k++, j++) {
            nums[k] = temp[j];
        }

    }

    public static void getNumberOfInversion(int arr[], int si, int ei) {
        if (si >= ei) {
            // counter(arr, si, mid + 1);
            return;
        }
        int mid = (si + ei) / 2;
        getNumberOfInversion(arr, si, mid);
        getNumberOfInversion(arr, mid + 1, ei);

        // call counter
        counter(arr, si, mid + 1, mid, ei); // int arr[], int siF, int siS, int mid, int ei
        // mergesort
        mergeSort(arr, si, ei, mid);

    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 1, 3, 5 };
        getNumberOfInversion(nums, 0, nums.length - 1);
        System.out.println(count);

    }
}