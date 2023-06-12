public class PairsInArray {
    public static void PrintPairs1(int arr[]) {
        int first = 0;
        int second = 1;
        while (first < arr.length - 1) {
            while (second <= arr.length - 1) {
                System.out.print("(" + arr[first] + "," + arr[second] + ")");
                second++;
            }
            first++;
            second = first + 1;
            System.out.println();
        }
    }

    public static void PrintPairs2(int arr[]) { // way to easy
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12 };
        PrintPairs2(arr);
    }
}
