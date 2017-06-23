package leetcode.Amazon;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ARPITHA RAO on 12-06-2017.
 */
public class kDiffPairs {
    public int findPairs(int[] nums, int k) {
        if(nums.length == 0 || nums == null || k < 0) return 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(k==0){
                if(entry.getValue()>=2){
                    count++;
                }
            }
            else{
                if(map.containsKey(entry.getKey()+k)){
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String args[]){
        kDiffPairs k = new kDiffPairs();
        int[] input = {1, 2, 3, 4, 5};
        System.out.println(k.findPairs(input, 1));
    }
}
