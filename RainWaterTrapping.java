//This is unoptimised code because we are iterating two times for both auxiliary arrays.
//1>
// public class RainWaterTrapping {
//     public static int rainWaterTrapping(int height[]) {
//         int maxvalue = Integer.MIN_VALUE;
//         int rainWaterTrapped = 0;
//         int widthofbar = 1;
//         // 1st auxiliary array for rightside maximum bar height.
//         int firstauxiliaryArray[] = new int[height.length];
//         int secondauxiliaryArray[] = new int[height.length];
//         for (int i = 0; i < height.length; i++) {
//             for (int j = i; j < height.length; j++) {
//                 if (height[j] > maxvalue) {
//                     maxvalue = height[j];
//                 }
//             }
//             firstauxiliaryArray[i] = maxvalue;
//             maxvalue = 0; // because there is nothing like negative height of bar.
//         }
//         // 2nd auxiliary array for leftside maximum bar height.
//         for (int i = 0; i < height.length; i++) {
//             for (int j = 0; j <= i; j++) {
//                 if (height[j] > maxvalue) {
//                     maxvalue = height[j];
//                 }
//             }
//             secondauxiliaryArray[i] = maxvalue;
//             maxvalue = 0; // because there is nothing like negative height of bar.
//         }

//         for (int i = 0; i < secondauxiliaryArray.length; i++) {
//             int waterlevel = Math.min(firstauxiliaryArray[i], secondauxiliaryArray[i]);
//             int barHeight = height[i];
//             rainWaterTrapped += ((waterlevel - barHeight) * widthofbar);
//         }
//         return rainWaterTrapped;
//     }

//     public static void main(String[] args) {
//         int height[] = { 4, 2, 0, 6, 3, 2, 5 };
//         int rainWaterTrapped = rainWaterTrapping(height);
//         System.out.println(rainWaterTrapped);
//     }

// }

//2>  Optimised Code  ,Time complexity is O(n)
public class RainWaterTrapping {
    public static int rainWaterTrapping(int height[]) {
        int rainWaterTrapped = 0;
        int widthofbar = 1;
        int n = height.length;
        // 2nd auxiliary array for rightside maximum bar height.
        int firstauxiliaryArray[] = new int[n]; // left
        int secondauxiliaryArray[] = new int[n]; // right
        firstauxiliaryArray[0] = height[0];
        secondauxiliaryArray[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++) {
            firstauxiliaryArray[i] = Math.max(firstauxiliaryArray[i - 1], height[i]);
        }
        // 1st auxiliary array for leftside maximum bar height.
        for (int i = n - 2; i >= 0; i--) {
            secondauxiliaryArray[i] = Math.max(secondauxiliaryArray[i + 1], height[i]);
        }

        for (int i = 0; i < secondauxiliaryArray.length; i++) {
            int waterlevel = Math.min(firstauxiliaryArray[i], secondauxiliaryArray[i]);
            int barHeight = height[i];
            rainWaterTrapped += ((waterlevel - barHeight) * widthofbar);
        }
        return rainWaterTrapped;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int rainWaterTrapped = rainWaterTrapping(height);
        System.out.println(rainWaterTrapped);
    }

}