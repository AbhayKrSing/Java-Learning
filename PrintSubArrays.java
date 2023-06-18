public class PrintSubArrays {
    public static void printsubArrays(int arr[]) {
        int totalsubArray = 0;
        for (int i = 0; i < arr.length; i++) {
            // System.out.print("(" + arr[i] + ")");
            for (int j = i; j < arr.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) { // just to print number b/w start and end
                    System.out.print(arr[k]);
                    if (k != j) {
                        System.out.print(",");
                    }
                }
                System.out.print("]");
                totalsubArray++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + totalsubArray);
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };
        printsubArrays(array);
    }

}