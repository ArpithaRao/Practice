package leetcode;

/**
 * Created by ARPITHA RAO on 22-04-2017.
 */
public class NumberOfIslands {

    private int n;
    private int m;
    public int findIslandArea(int[][] matrix){
        int count = 0;
        n = matrix.length;

        if(n == 0) return 0;
        m = matrix[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                if(matrix[i][j] == 1){
                    DFSVisiting(matrix, i, j);
                    ++count;
                }
            }

        return count;
    }

    public void DFSVisiting(int[][] matrix, int i,int j){

        if(i < 0 || j < 0 || i >= n || j >= m || matrix[i][j]!=1) return;
            matrix[i][j] = 0;
            DFSVisiting(matrix, i + 1, j);
            DFSVisiting(matrix, i - 1, j);
            DFSVisiting(matrix, i, j + 1);
            DFSVisiting(matrix, i, j - 1);


    }

    public static void main(String args[]){
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        int[][] input = {{1,1,1,1,0},
                         {0,1,1,0,0},
                         {1,0,0,0,1},
                         {0,0,1,0,1}};
        int n = numberOfIslands.findIslandArea(input);

        System.out.println("Islands "+n);
    }

}
