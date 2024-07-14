package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void printArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[arr.length - 1] + "]");
    }

    public static void nextGreater(int nums[], int ans[]) { // TC : O(n)
        Stack<Integer> st = new Stack<>(); // we will store idx of element of arr.
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = nums[st.peek()];
            }
            st.push(i);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 6, 8, 0, 1, 3, 2, 7 };
        int ans[] = new int[nums.length];
        nextGreater(nums, ans);

        printArray(ans);
    }
}