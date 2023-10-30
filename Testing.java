
public class Testing {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] addx(int arr[], int n, int x) {
        int newarr[] = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        newarr[n] = x;
        return newarr;
    }

    public static int[] sortedArray(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int op[] = new int[0];
        if (a[i] <= b[j]) {
            op = addx(op, op.length, a[i]); // appending using helper
            i++;
        } else {
            op = addx(op, op.length, b[j]); // appending using helper
            j++;
        }
        while (i < a.length || j < b.length) {
            if (a[i] <= b[j]) {
                if (a[i] > op[op.length - 1]) {
                    op = addx(op, op.length, a[i]);
                    i++;
                }
            } else {
                if (b[j] > op[op.length - 1]) {
                    op = addx(op, op.length, b[j]);
                    j++;
                }
            }

        }
        return op;
    }

    public static void main(String[] args) {
        int a[] = { 1, 1, 2, 3, 4, 5 };
        int b[] = { 2, 3, 4, 4, 5 };
        printarray(sortedArray(a, b));
    }

}