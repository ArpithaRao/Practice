package leetcode.Amazon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ARPITHA RAO on 12-06-2017.
 */
public class PascalTriangleII {

    public List<Integer> getRow(int rowIndex){
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < rowIndex+1; i++){
            res.add(1);
            for(int j = i-1; j > 0; j--){
                res.set(j, res.get(j)+ res.get(j-1));
            }
        }
        return res;
    }

    public static void main(String args[]){
        PascalTriangleII ps2 = new PascalTriangleII();
        System.out.println(ps2.getRow(5));
    }

}
