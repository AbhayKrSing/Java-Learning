package Testing;

public class Testing {
    public boolean isPossible(int bloomDay[], int k, int m, int day) {
        int count = 0;
        int bq = 0; // bouquets
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                count++;
            }
            if (count == k) {
                bq++;
                if (bq == m) {
                    return true;
                }
                count = 0;
            } else if (bloomDay[i] > day) {
                count = 0;
            }
        }
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) { // brute approach
        // Edge condn
        if (bloomDay.length < m * k) {
            return -1;
        }
        // Find max Element(Max day of blossom)
        int maxElem = Integer.MIN_VALUE;
        int minElem = Integer.MAX_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            maxElem = Math.max(maxElem, bloomDay[i]);
            minElem = Math.min(minElem, bloomDay[i]);
        }

        for (int j = minElem; j <= maxElem; j++) {
            if (isPossible(bloomDay, k, m, j)) {
                return j;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

    }
}