package CodingChallenges.rallyhealth.MazeGeneration;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ARPITHA RAO on 13-04-2017.
 */
public class MazeGeneration extends JFrame {

    private int maze[][] =
                    {{1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {1,0,1,0,1,0,1,0,0,0,0,0,1},
                    {1,0,1,0,1,1,1,0,1,0,0,0,1},
                    {1,0,0,0,1,1,1,0,0,0,0,1,1},
                    {1,0,1,0,0,0,0,0,1,1,1,0,1},
                    {1,0,1,0,1,1,1,0,1,0,0,1,1},
                    {1,0,1,0,1,1,1,0,1,0,1,0,1},
                    {1,0,1,0,1,1,1,0,1,0,1,0,1},
                    {1,0,0,0,0,0,0,9,0,0,1,0,1},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1}
                    };

    private final List<Integer> path = new ArrayList<>();
    private int pathIndex;

    public MazeGeneration() {
        setTitle("Simple Maze Solver");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*starting from co ordinates at (1,3) findPath finds the path to the matrix value that matches 9,
         where 9 is assumed to be the destination*/

        DFSMaze.findPath(maze, 1, 3, path);
        pathIndex = path.size() - 2;
    }

    @Override
    public void paint(Graphics graphic) {
        super.paint(graphic);
        graphic.translate(70, 70);

        //generating maze
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[0].length; col++) {
                graphic.setColor(Color.WHITE);
                graphic.fillRect(45 * col, 45 * row, 45, 45);
            }
        }

        //showing the path found from DFS
        for (int p = 0; p < path.size(); p += 2) {
            int pathX = path.get(p);
            int pathY = path.get(p + 1);
            graphic.setColor(Color.black);
            graphic.fillRect(pathX * 40, pathY * 40, 40, 40);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MazeGeneration mazeGeneration = new MazeGeneration();
                mazeGeneration.setVisible(true);
            }
        });
    }

}
