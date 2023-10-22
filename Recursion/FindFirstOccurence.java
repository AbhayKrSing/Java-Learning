package Recursion;

public class FindFirstOccurence {
    public static int getFirstOccurence(int[] n, int i, int key) {
        if (n[i] == key) {
            return i;
        } else if (i == n.length - 1) {
            return -1;
        }
        return getFirstOccurence(n, i + 1, key);
    }

    public static void main(String[] args) {
        int nums[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;
        System.out.println(getFirstOccurence(nums, 0, key));
    }
}
