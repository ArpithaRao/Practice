package leetcode;

import java.util.Arrays;

/**
 * Created by ARPITHA RAO on 13-05-2017.
 */
public class MinMoves {
    public int minMoves(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            if((nums[i]==nums[i+1])){
                return count;
            }

            else{
                fixArray(nums);
                count++;
            }
        }

        return count;
    }

    public void fixArray(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            nums[i] = nums[i]+1;
        }
    }
}
