package leetcode;

import java.util.HashSet;

/**
 * Created by ARPITHA RAO on 21-06-2017.
 */
public class LineReflection {

    public boolean isReflected(int[][] points) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashSet<String> set = new HashSet<>();

        for(int[] p:points){
            max = Math.max(max, p[0]);
            min = Math.min(min, p[0]);
            String str = p[0]+","+p[1];
            set.add(str);
        }
        int sum = max+min;

        for(int[] p:points){
            String str = (sum - p[0])+","+p[1];
            if(!set.contains(str)) return false;
        }

        return true;

    }

    public static void main(String args[]){
        LineReflection lr = new LineReflection();

        //test case1
        int[][] points = {{1,1},{-1,1}};
        System.out.println(lr.isReflected(points));

        //test case2
        int[][] points1 = {{1,1},{-1,-1}};
        System.out.println(lr.isReflected(points1));

    }
}
