package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = { 0, 1, 3, 5, 5, 8 };
        int end[] = { 6, 2, 4, 7, 9, 9 };

        int[][] activities = new int[end.length][3];
        for (int i = 0; i < activities.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        int count = 1;
        int lastTime = activities[0][2]; // lasTime=end[0];
        for (int i = 1; i < activities.length; i++) {
            if (lastTime <= activities[i][1]) { // lastTime <= start[i]
                count++;
                lastTime = activities[i][2]; // lastTime=end[i]
            }
        }
        System.out.println("Max activities is : " + count);

    }
}
