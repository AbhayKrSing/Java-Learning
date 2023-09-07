//Given route containing 4 directions (E,W,N,S).find the shortest path to reach destination.
package String;

public class Shortestpath {
    public static void shortestPath(String str) {
        int xcorr = 0;
        int ycorr = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'W') {
                xcorr--;
            } else if (str.charAt(i) == 'E') {
                xcorr++;
            } else if (str.charAt(i) == 'N') {
                ycorr++;
            } else {
                ycorr--;
            }
        }
        double distance = Math.sqrt(Math.pow(ycorr, 2) + Math.pow(xcorr, 2));
        System.out.println(distance);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        shortestPath(str);
    }
}
