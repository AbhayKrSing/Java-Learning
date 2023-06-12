
public class ReverseArray {
    public static int[] reverseArray1(int arr[]) { // This code is not optimised because it time complexity is o[n] but
                                                   // its space complexity is o[n] because we are creating new array.
        int size = arr.length;
        int newarr[] = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            newarr[size - i - 1] = arr[i];
        }
        return newarr;
    }

    public static void reverseArray2(int arr[]) { // This code is optimised because it time complexity is o[n/2]=o[n]
                                                  // but
                                                  // its space complexity is o[1] =constant because we are not creating
                                                  // new array.
        int size = arr.length;
        for (int i = 0; i < (size / 2); i++) {
            int t;
            t = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = t;
        }
    }

    public static void reverseArray3(int arr[]) {// This code is optimised because it time complexity is o[n/2]=o[n]
                                                 // but
                                                 // its space complexity is o[1] =constant because we are not creating
                                                 // new array.
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int t = arr[first];
            arr[first] = arr[last];
            arr[last] = t;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 3, 5, 777, 4, 4, 24 };
        // int arr[] = reverseArray1(array);
        // reverseArray2(array); // array passed as a pointer in function
        reverseArray3(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
