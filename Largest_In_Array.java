public class Largest_In_Array {
    public static void LargestINArray(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("largest Number is : " + largest);
        System.out.println("smallest Number is :" + smallest);
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 6, 3, 5 };
        LargestINArray(arr);

    }
}
