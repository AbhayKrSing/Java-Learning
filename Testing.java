
public class Testing {
    static long count = 0;

    static void merge(long arr[], int start, int mid, int end) {
        long temp[] = new long[end - start + 1];
        int fp = start;
        int sp = mid + 1;
        int k = 0;
        while (fp <= mid && sp <= end) {
            if (arr[fp] < arr[sp]) {
                temp[k] = arr[fp];
                fp++;
            } else {
                temp[k] = arr[sp];
                sp++;
            }
            k++;
        }
        // filling out left elements
        while (fp <= mid) {
            temp[k] = arr[fp];
            fp++;
            k++;
        }
        while (sp <= end) {
            temp[k] = arr[sp];
            sp++;
            k++;
        }

        // replacing temp[] value to original array
        for (int i = 0, j = start; j <= end && i < temp.length; i++, j++) {
            arr[j] = temp[i];
        }
    }

    static void counting(long arr[], int start, int mid, int end) {
        int s1 = start;
        int s2 = mid + 1;
        while (s1 <= mid && s2 <= end) {
            if (arr[s1] > arr[s2]) {
                count += (mid - s1 + 1);
                s2++;
            } else {
                s1++;
            }
        }

    }

    static void GetInversion(long arr[], int start, int end) {
        // base case
        if (start >= end) {
            return;
        }
        // fn call and kaam
        int mid = (start + end) / 2;
        GetInversion(arr, start, mid);
        GetInversion(arr, mid + 1, end);

        counting(arr, start, mid, end);

        merge(arr, start, mid, end); // merge and sort

    }

    public static void main(String[] args) {
        long arr[] = { 84, 2, 37, 3, 67, 82, 19, 97, 91, 63, 27, 6, 13, 90, 63, 89, 100, 60, 47, 96, 54, 26, 64, 50, 71,
                16, 6, 40, 84, 93, 67, 85, 16, 22, 60 };
        GetInversion(arr, 0, arr.length - 1);
        System.out.println(count);
    }
}