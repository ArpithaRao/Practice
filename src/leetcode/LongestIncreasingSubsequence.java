package leetcode;

import java.util.Arrays;

/**
 * Created by ARPITHA RAO on 19-01-2017.
 */
public class LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;

        for(int x : nums) {
            int i = Arrays.binarySearch(dp, 0, len, x);
            if(i < 0){
                i = -(i + 1);
            }
            dp[i] = x;
            if(i == len){
                len++;
            }
        }

        return len;
    }

    public static void main(String args[]){
        int[] array = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(array));
    }

}
