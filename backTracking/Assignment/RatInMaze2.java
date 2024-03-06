package backTracking.Assignment;

import java.util.ArrayList;

public class RatInMaze2 {
    static ArrayList<String> str = new ArrayList<>();

    // public static String validpath(int[][] maze, int[][] visited, int row, int
    // col) {
    // // down
    // if (row < maze.length - 1 && visited[row + 1][col] != 1 && maze[row + 1][col]
    // != 0) {
    // return "D";
    // }
    // // left
    // else if (col > 0 && visited[row][col - 1] != 1 && maze[row][col - 1] != 0) {
    // return "L";
    // }
    // // right
    // else if (col < maze.length - 1 && visited[row][col + 1] != 1 && maze[row][col
    // + 1] != 0) {
    // return "R";
    // }
    // // up
    // else if (row > 0 && visited[row - 1][col] != 1 && maze[row - 1][col] != 0) {
    // return "U";
    // }
    // return "";
    // }

    public static void getAllPaths(int maze[][], int row, int col, int[][] visited, String ans) {
        // base call
        if (row == maze.length - 1 && col == maze.length - 1) {
            str.add(ans);
            return;
        }
        int[] d1 = { 1, 0, 0, -1 };
        int[] d2 = { 0, -1, 1, 0 };
        String d3 = "DLRU";
        // fn and kaam
        for (int i = 0; i < 4; i++) { // four allowed directions(D-->L-->R-->U)
            int nextrow = row + d1[i];
            int nextcol = col + d2[i];
            if (nextrow < maze.length && nextrow >= 0 && nextcol >= 0 && nextcol < maze.length
                    && visited[nextrow][nextcol] != 1 && maze[nextrow][nextcol] != 0) {

                visited[row][col] = 1;
                getAllPaths(maze, nextrow, nextcol, visited, ans + d3.charAt(i));
                visited[row][col] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
        int visited[][] = new int[maze.length][maze.length];
        getAllPaths(maze, 0, 0, visited, "");
        System.out.println(str);
    }
}