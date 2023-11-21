
public class UnionOfArray {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortedArray(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int arr[] = new int[a.length + b.length];
        if (a[0] <= b[0]) { // for 1st element
            arr[0] = a[0];
            i++;
        } else {
            arr[0] = b[0];
            j++;
        }
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                if (arr[k] < a[i]) {
                    k++;
                    arr[k] = a[i];
                    i++;
                } else {
                    i++;
                }
            } else {
                if (arr[k] < b[j]) {
                    k++;
                    arr[k] = b[j];
                    j++;
                } else {
                    j++;
                }
            }
        }
        // if either i exceeds or j exceeds from their respective array
        if (i < a.length) {
            for (int l = i; l < a.length; l++) {
                if (a[l] > arr[k]) {
                    k++;
                    arr[k] = a[l];
                }
            }
        } else {
            for (int l = j; l < b.length; l++) {
                if (b[l] > arr[k]) {
                    k++;
                    arr[k] = b[l];
                }
            }
        }
        printarray(arr);

    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 6 };
        int b[] = { 2, 3, 5, 9 };
        sortedArray(a, b);
    }

}