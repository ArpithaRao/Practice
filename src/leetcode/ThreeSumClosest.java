package leetcode;

import java.util.Arrays;

/**
 * Created by ARPITHA RAO on 11-01-2017.
 */
public class ThreeSumClosest {

    public static int threeSumClosest(int[] inputArray, int target){
        int result = inputArray[0]+inputArray[1]+inputArray[inputArray.length - 1];
        Arrays.sort(inputArray);

        for(int i = 0; i < inputArray.length - 1; i++){
            int j = i + 1, k = inputArray.length - 1;

            while(j < k){
                int sum = inputArray[i] + inputArray[j] + inputArray[k];
                if(sum > target) {
                    k--;
                }
                else {
                    j++;
                }
                if(Math.abs(sum - target) < Math.abs(result - target)){
                    result = sum;
                }

            }
        }
        return result;
    }

    public static void main(String args[]){
        int[] inputArray = {0, 1, 2};
        int target = 0;
        System.out.println(threeSumClosest(inputArray,target));
    }

}
