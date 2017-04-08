package leetcode;

import java.util.*;

/**
 * Created by ARPITHA RAO on 09-03-2017.
 */
public class NextGreaterElement1 {

    public static ArrayList<Integer> nextGreaterElement(int[] findNums, int[] nums) {

        Hashtable<Integer, Integer> position = new Hashtable<>();
        for(int i = 0; i < findNums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(findNums[i]== nums[j] && !position.containsKey(findNums[i])){
                    position.put(findNums[i],j);
                }
            }
        }

        System.out.println(position);

        ArrayList<Integer> output = new ArrayList<>();

        Set<Map.Entry<Integer,Integer>> entrySet = position.entrySet();

        System.out.println(entrySet);

       for(Map.Entry<Integer,Integer> entry : entrySet){

           for(int i = entry.getValue(); i < nums.length-1; i++){
               if(nums[i]>entry.getKey()){
                   output.add(nums[i]);
               }
               else {
                   output.add(-1);
               }
           }

       }

        return output;
    }

    public static void main(String args[]){
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};

        System.out.println(nextGreaterElement(nums1,nums2));
    }

}
