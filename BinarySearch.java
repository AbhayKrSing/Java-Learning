import java.util.Scanner;

public class BinarySearch {
    public static int binarysearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = { 1, 2, 4, 5, 10, 13};
        int arr[] = { 1, 2, 4, 5, 10, 13, 70 };
        int key = sc.nextInt();
        int result = binarysearch(arr, key);
        System.out.println(result == -1 ? "Nothing Fount" : ("key is Present at index : " + result));
        sc.close();
    }
}