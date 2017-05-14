package CodingChallenges.MazeGeneration;

import java.util.List;

/**
 * Created by ARPITHA RAO on 13-04-2017.
 */
public class DFSMaze {

    // (x,y) is the starting point to find the path

    public static boolean findPath(int[][] maze, int x, int y
            , List<Integer> path) {

        if (maze[y][x] == 9) {
            path.add(x);
            path.add(y);
            return true;
        }

        if (maze[y][x] == 0) {
            maze[y][x] = 2;

            int dx = -1;
            int dy = 0;
            if (findPath(maze, x + dx, y + dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }

            dx = 1;
            dy = 0;
            if (findPath(maze, x + dx, y + dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }

            dx = 0;
            dy = -1;
            if (findPath(maze, x + dx, y + dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }

            dx = 0;
            dy = 1;
            if (findPath(maze, x + dx, y + dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
    }

}
