package leetcode.Amazon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ARPITHA RAO on 12-06-2017.
 */
public class PascalTriangle {

    public List<List<Integer>> getRows(int numRows){
        List<List<Integer>> allRows = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        for(int i = 0; i < numRows;i++){
            row.add(0,1);
            for(int j = 1; j < row.size()-1;j++){
                row.set(j, row.get(j)+row.get(j+1));
            }
            allRows.add(new ArrayList<>(row));
        }
        return allRows;
    }

    public static void main(String args[]){
        PascalTriangle pt = new PascalTriangle();
        System.out.println(pt.getRows(5));
    }
}
