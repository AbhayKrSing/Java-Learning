package Array2d;

import java.util.Scanner;

public class Array2d {
    public static void FindLargest(int arr[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                largest = Math.max(largest, arr[i][j]);
            }
        }
        System.out.print("Largest element is " + largest);
    }

    public static void PrintArray2d(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        PrintArray2d(arr);
        FindLargest(arr);
        sc.close();
    }
}
