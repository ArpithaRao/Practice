package Algorithms;

/**
 * Created by ARPITHA RAO on 28-01-2016.
 */
//to find the maximum sum of contiguous subarray
public class KadaneAlgo {
    public static void main(String args[]) {
        String string = "2,3,-2,10,10";
        String[] numbers = string.split(",");
        int max_so_far = 0;
        for (String num : numbers) {
            int x = Integer.parseInt(num);
            max_so_far =  Math.max(max_so_far,max_so_far+x);
        }
        System.out.println(max_so_far);
    }
}
