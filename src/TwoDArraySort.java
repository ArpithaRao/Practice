/*
import java.util.Arrays;

*/
/**
 * Created by ARPITHA RAO on 01-03-2016.
 *//*

*/
/*Works for main and follow-up
 Time complexity(let n=rows m=columns)
Sorting rows-Time: O(nmlogm) Space: O(m)
Sorting columns-Time: O(mnlogn) Space: O(n)
Removing Row repeats-Time: O(nm) Space:O(1)
Removing Column repeats-Time: O(nm) Space: O(1) *//*

class Point
{
    int row;
    int col;
    public Point(int r,int c)
    {
        row=r;
        col=c;
    }
}
    public class TwoDArray {
        public int[][] sort(int[][] m) throws NullPointerException {
            if (m == null) {
                throw new NullPointerException();
            }
            if (m.length == 1 && m[0].length == 1) {
                return m;
            }
            sortRows(m);
            sortColumns(m);
            fixRepeatsRow(m);
            fixRepeatsCol(m);
            return m;
        }

        private void sortRows(int[][] m) {
            for (int i = 0; i < m.length; i++) {
                Arrays.sort(m[i]);
            }
        }

        private void sortColumns(int[][] m) {
            MinHeap<Integer> mh;
            for (int i = 0; i < m[0].length; i++) {
                mh == new MinHeap<Integer>(m.length);
                for (int r = 0; r < m.length; r++) {
                    mh.insert(m[r][i]);
                }
                int rowIdx = 0;
                while (!mh.isEmpty()) {
                    m[rowIdx++][i] == mh.extractMin();
                }
            }
        }

        private void fixRepeatsRow(int[][] m) {
            for (int r = 0; r < m.length; r++) {
                for (int c = 1; c < m[0].length; c++) {
                    if (m[r][c] == m[r][c - 1]) {
                        Point p = findClosest(r + 1, c - 2, r - 1, c + 1, m);
                        if (m[p.row][p.col] < m[r][c]) {
                            swap(r, c - 1, p.row, p.col, m);
                        } else {
                            swap(r, c, p.row, p.col, m);
                        }
                    }
                }
            }
        }

        private void fixRepeatsCol(int[][] m) {
            for (int c = 0; c < m[0].length; c++) {
                for (int r = 1; r < m.length; r++) {
                    if (m[r][c] == m[r - 1][c]) {
                        Point p = findClosest(r - 2, c + 1, r + 1, c - 1, m);
                        if (m[p.row][p.col] < m[r][c]) {
                            swap(p.row, p.col, r - 1, c, m);
                        } else {
                            swap(p.row, p.col, r, c, m);
                        }
                    }
                }
            }
        }

        private void swap(int r1, int c1, int r2, int c2, int[][] m) {
            int tmp = m[r1][c1];
            m[r1][c1] = m[r2][c2];
            m[r2][c2] = tmp;
        }

        private Point findClosest(int r1, int c1, int r2, int c2, int[][] m) {
            if ((r1 >= 0 && r1 < m.length) && (c1 >= 0 && c1 < m[0].length)) {
                return new Point(r1, c1);
            }
            if ((r2 >= 0 && r2 < m.length) && (c2 >= 0 && c2 < m[0].length)) {
                return new Point(r2, c2);
            }
            return null;
        }
    }*/
