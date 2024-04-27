
public class Testing {
    public static double median(int[] a, int[] b) {
        int left = 0;
        int right = 0;
        double count = 0;
        double length = Math.ceil((a.length + b.length) / 2.0) - 1;
        while (left < a.length && right < b.length) {
            if (count == length) {
                if ((a.length + b.length) % 2 == 0) {
                    return (a[left] + b[right]) / 2.0;
                } else {
                    if (a.length >= b.length) {
                        return b[right];
                    } else {
                        return a[left];
                    }
                }
            }
            if (a[left] <= b[right]) {
                left++;
            } else {
                right++;
            }
            count++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 2 };
        int b[] = { 2, 4, 4 };
        System.out.println(median(a, b));
        // median(a, b);
    }
}