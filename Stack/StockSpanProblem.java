package Stack;

import java.util.Stack;

public class StockSpanProblem {
    public static void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.print(nums[i]);
                continue;
            }
            System.out.print(nums[i] + ",");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        int prices[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[prices.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;

        for (int i = 1; i < prices.length; i++) {
            while (!st.isEmpty() && prices[i] >= prices[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i + 1;
                st.push(i);
                continue;
            }
            span[i] = i - st.peek();
            st.push(i);
        }
        printArray(span);
    }
}
