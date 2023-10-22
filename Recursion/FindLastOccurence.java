package Recursion;

public class FindLastOccurence {
    public static int getLastOccurence(int num[], int i, int key) {
        if (num[i] == key) {
            return i;
        } else if (i == 0) {
            return -1;
        }
        return getLastOccurence(num, i - 1, key); // first occurence from last.
    }

    public static void main(String[] args) {
        int nums[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(getLastOccurence(nums, nums.length - 1, 5));
    }
}
