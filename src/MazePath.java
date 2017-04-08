import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ARPITHA RAO on 02-03-2016.
 */
//This is a dynamic programming approach
public class MazePath {

    static ArrayList<Point> getPath(boolean[][] maze){

        if(maze== null || maze.length == 0){
            return null;
        }

        ArrayList<Point> path = new ArrayList<>();
        HashMap<Point, Boolean> cache = new HashMap<>();

        int lastRow = maze.length -1;
        int lastCol = maze[0].length -1;

        if(getPath(maze, lastRow, lastCol, cache, path))
            return path;

        return null;
    }

    static boolean getPath(boolean[][] maze, int row, int col, HashMap<Point, Boolean> cache, ArrayList<Point> path){

        if(row < 0 || col < 0 || !maze[row][col]) return false;

        Point p = new Point(row, col);

        if(cache.containsKey(p)) return cache.get(p);

        boolean isOrigin = row == 0 && col == 0;
        boolean success = false;

        if(isOrigin || getPath(maze, row - 1, col, cache, path) || getPath(maze, row, col - 1, cache, path)){
            path.add(p);
            success = true;
        }

        cache.put(p, success);
        return success;
    }

    public static void main(String args[]){
        boolean[][] maze = {{true, false, true, false},
                            {true, true, true, false},
                            {true, true, true, false},
                            {true, false, true, true}};

        System.out.print(getPath(maze));

    }
}
