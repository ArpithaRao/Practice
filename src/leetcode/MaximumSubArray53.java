package leetcode;

import junit.framework.Assert;

/**
 * Created by ARPITHA RAO on 12-06-2017.
 */
public class MaximumSubArray53 {
    //using Kadane's Algorithm
    public int findMaxSum(int[] nums){
        int max = nums[0], maxSoFar = nums[0];
        for(int i = 0; i  < nums.length; i++){
            max = Math.max(max+nums[i], nums[i]);
            maxSoFar = Math.max(max, maxSoFar);
        }
        return maxSoFar;
    }

    public static void main(String args[]){
        MaximumSubArray53 m53 = new MaximumSubArray53();
        int[] input  = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(m53.findMaxSum(input));
        Assert.assertEquals(6, m53.findMaxSum(input));
    }

}
