/**
 * Created by ARPITHA RAO on 24-01-2016.
 */
public class rotateMatrix {
    public static void main(String args[]) {
        int [][]matrix= {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.print(rotateMatrix(matrix));
    }
        public static int[][] rotateMatrix(int[][] matrix)
        {
    /* W and H are already swapped */
            int w = matrix.length;
            int h = matrix[0].length;
            int[][] ret = new int[h][w];
            for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                    ret[i][j] = matrix[w - j - 1][i];
                }
            }
            return ret;
        }


    }


