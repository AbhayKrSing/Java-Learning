package Recursion;

public class FindLastOccurence2 {
    public static int getlastoccurence(int num[], int i, int key) {
        if (i == num.length) {
            return -1;
        }
        int isFound = getlastoccurence(num, i + 1, key);
        if (isFound == -1 && key == num[i]) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int nums[] = { 8, 3, 6, 9, 5, 10, 2, 5, 5, 9, 5 };
        System.out.println(getlastoccurence(nums, 0, 5));
    }
}
