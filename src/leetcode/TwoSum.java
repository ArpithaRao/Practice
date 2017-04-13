package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ARPITHA RAO on 11-04-2017.
 */
public class TwoSum {

    //unsorted array
    public int[] getindices(int[] array, int target){

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < array.length; i++){
            if(map.containsKey(target - array[i])){
                result[0]= map.get(target - array[i]);
                result[1] = i;
            }
            map.put(array[i],i);
        }

        for(int i = 0; i < array.length; i++){

        }

//        throw new IllegalArgumentException("no two indices add upto the target");

        return result;
    }

    //sorted array
    public int[] twoSumSortedInput(int[] array, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            if(array[i]>target) break;
            if(map.containsKey(target - array[i])){
                return new int[]{ map.get(target - array[i]), i};
            }
            map.put(array[i],i);
        }

        for(int i = 0; i < array.length; i++){

        }

        throw new IllegalArgumentException("no two indices add upto the target");
    }

    ArrayList<Integer> inputArray = new ArrayList<>();
    public void add(int a){
        inputArray.add(a);
    }

    public boolean find(int target){
        int[] array = new int[inputArray.size()];
        for(int i = 0; i < inputArray.size(); i++){
            array[i] = inputArray.get(i);
        }
        int[] result = getindices(array,target);
        if(result[0] + result[1] == target){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        TwoSum twoSum = new TwoSum();

       /* int[] input = {1,3,2,0,5,4};
        int target = 5;

        int[] result = twoSum.getindices(input, target);
        for(int i =0; i < result.length; i++){

            System.out.print(result[i] + " ");
        }*/
/*
        System.out.println();
        int[] input2 = {10, 30, 51, 68, 105, 237, 359, 496, 555};
        int target2 = 288;
        TwoSum twoSum2 = new TwoSum();
        int[] result2 = twoSum2.twoSumSortedInput(input2, target2);
        for(int i =0; i < result.length; i++){

            System.out.print(result2[i] + " ");
        }*/

        twoSum.add(10);
        twoSum.add(1);
        twoSum.add(2);
        twoSum.add(3);
        twoSum.add(4);
        twoSum.add(5);
        System.out.println(twoSum.find(100));

    }

}
