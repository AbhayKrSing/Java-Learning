import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        String arr[] = { "shazam", "black adma", "superman", "wonderwoman" };
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        System.out.println(key);
        for (int i = 0; i < arr.length; i++) {
            // if (arr[i] == key) { // Use if b.equals(c) because b==c compares references
            // in java. It tells that if both the objects are referring to same memory
            // locations or not.
            if (arr[i].equals(key)) {
                System.out.println("key is present at index no: " + i);
                break;
            } else if (i == arr.length - 1) {
                System.out.println("key not found");
            }
        }

        sc.close();
    }
}
