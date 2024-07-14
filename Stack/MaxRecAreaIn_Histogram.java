package Stack;

import java.util.Stack;

public class MaxRecAreaIn_Histogram {
    public static int largestRectangleArea(int[] heights) {
        // for right boundary(right first smallest)
        // for left boundary(left first smallest)
        int right[] = new int[heights.length];
        int left[] = new int[heights.length];

        // for right first smallest
        Stack<Integer> st = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                right[i] = heights.length;
            } else {
                right[i] = st.peek();
            }
            st.push(i);

        }
        // empty st stack
        st.clear();

        // for left first smallest

        for (int i = 0; i < heights.length; i++) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = st.peek();
            }
            st.push(i);
        }

        // getting maxRec area
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int width = right[i] - left[i] - 1;
            maxArea = Math.max(width * heights[i], maxArea);
        }
        return maxArea;

    }

    public static void main(String[] args) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(largestRectangleArea(heights));
        ;
    }
}
