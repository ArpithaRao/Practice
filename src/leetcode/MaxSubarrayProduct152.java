package leetcode;

/**
 * Created by ARPITHA RAO on 12-06-2017.
 */
public class MaxSubarrayProduct152 {
    // idea from the book programming pearl 2

    // keeping local min and max, consider the most max value of three min, max, nums[i]

    public int findMaxSubarrayProduct(int[] nums){

        int max  = nums[0], min = nums[0], maxCur = nums[0], minCur = nums[0], maxSoFar = nums[0];

        for(int i = 1; i < nums.length; i++){
            max = Math.max(Math.max(minCur * nums[i], maxCur * nums[i]), nums[i]);
            min = Math.min(Math.min(minCur * nums[i], maxCur * nums[i]), nums[i]);
            maxSoFar = Math.max(max, maxSoFar);
            minCur = min;
            maxCur = max;
        }
        return maxSoFar;

    }

    public static void main(String args[]){
        MaxSubarrayProduct152 ms152 = new MaxSubarrayProduct152();
        int[] input = {2,3,-2,4};
        System.out.println(ms152.findMaxSubarrayProduct(input));
    }

}
