
public class InsertionSort {
    // 1. Abhay's code
    // public static void InsertionSorting(int[] arr) { //2nd best
    // int n = arr.length;
    // int track = 0; // use to find wheather insertion point is in B/w or not.
    // for (int i = 0; i < n - 1; i++) {
    // int temp = arr[i + 1];
    // // yeh wala loop agar beech mey kahi insertion point mil jata hai tab element
    // ko
    // // insert kar deta hai ,Likin agar aisa nhi hota i.e agar beech mey insertion
    // // point nhi mila iska matlb ki wo element ekdam first mey jayega so wo kaam
    // // line number 19 kar rhi hai.
    // for (int j = i; j >= 0; j--) {
    // if (temp < arr[j]) { // just change the sign to get Insertion sort in
    // descending order
    // arr[j + 1] = arr[j];
    // } else {
    // arr[j + 1] = temp;
    // track++;
    // break;
    // }
    // }
    // if (track == 0) {
    // arr[0] = temp;
    // }

    // }
    // }

    // 2. Shraddha inspired code+Abhay modified version
    // public static void InsertionSorting(int[] arr) { //1st best
    // int n = arr.length;
    // for (int i = 1; i <= n - 1; i++) {
    // int curr = i;
    // int prev = i - 1;
    // while (prev >= 0 && arr[prev] > arr[curr]) {
    // int temp = arr[curr];
    // arr[prev + 1] = arr[prev];
    // arr[prev] = temp;
    // prev--;
    // curr--;
    // }
    // }
    // }
    // 3. Sharaddha didi ne thodi bakchodi ki thi yaha pe time waste kiya mera.
    public static void InsertionSorting(int[] arr) { // 3rd best for me
        int n = arr.length;
        for (int i = 1; i <= n - 1; i++) {
            int currvalue = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > currvalue) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = currvalue;
        }
    }

    public static void printarray(int arr[]) { // for printing element present in array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };
        InsertionSorting(nums);
        printarray(nums);
    }
}
