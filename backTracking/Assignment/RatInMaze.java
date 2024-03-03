package backTracking.Assignment;

import java.util.ArrayList;

public class RatInMaze {
    static ArrayList<String> str = new ArrayList<>();

    public static String validpath(int[][] maze, int[][] visited, int row, int col) {
        // down
        if (row < maze.length - 1 && visited[row + 1][col] != 1 && maze[row + 1][col] != 0) {
            return "D";
        }
        // left
        else if (col > 0 && visited[row][col - 1] != 1 && maze[row][col - 1] != 0) {
            return "L";
        }
        // right
        else if (col < maze.length - 1 && visited[row][col + 1] != 1 && maze[row][col + 1] != 0) {
            return "R";
        }
        // up
        else if (row > 0 && visited[row - 1][col] != 1 && maze[row - 1][col] != 0) {
            return "U";
        }
        return "";
    }

    public static void getAllPaths(int maze[][], int row, int col, int[][] visited, String ans) {
        // base call
        if (row == maze.length - 1 && col == maze.length - 1) {
            str.add(ans);
            return;
        }

        // fn and kaam
        // Problem with this code is what will i do if i have 8 directions will you
        // write it 6 times??
        // down
        if (row < maze.length - 1 && visited[row + 1][col] != 1 && maze[row + 1][col] != 0) {
            visited[row][col] = 1;
            getAllPaths(maze, row + 1, col, visited, ans + "D");
            visited[row][col] = 0;
        }
        // left
        if (col > 0 && visited[row][col - 1] != 1 && maze[row][col - 1] != 0) {
            visited[row][col] = 1;
            getAllPaths(maze, row, col - 1, visited, ans + "L");
            visited[row][col] = 0;
        }
        // right
        if (col < maze.length - 1 && visited[row][col + 1] != 1 && maze[row][col + 1] != 0) {
            visited[row][col] = 1;
            getAllPaths(maze, row, col + 1, visited, ans + "R");
            visited[row][col] = 0;
        }
        // up
        if (row > 0 && visited[row - 1][col] != 1 && maze[row - 1][col] != 0) {
            visited[row][col] = 1;
            getAllPaths(maze, row - 1, col, visited, ans + "U");
            visited[row][col] = 0;
        }

    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
        int visited[][] = new int[maze.length][maze.length];
        getAllPaths(maze, 0, 0, visited, "");
        System.out.println(str);

    }
}
