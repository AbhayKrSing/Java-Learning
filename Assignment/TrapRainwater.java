package Assignment;

public class TrapRainwater {
    public static int trap(int[] height) {
        int n = height.length;
        int helper1[] = new int[n]; // left
        int helper2[] = new int[n]; // right
        int trappedWater = 0;
        helper1[0] = height[0];
        helper2[n - 1] = height[n - 1];
        for (int i = 1; i < height.length; i++) { // for left side max
            helper1[i] = Math.max(height[i], helper1[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) { // for right side max
            helper2[i] = Math.max(height[i], helper2[i + 1]);
        }
        for (int i = 0; i < height.length; i++) {
            trappedWater += Math.min(helper1[i], helper2[i]) - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 3, 2, 5 };
        // for left side
        System.out.println(trap(height));
        ;
    }

}