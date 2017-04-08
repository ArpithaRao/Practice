package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ARPITHA RAO on 11-01-2017.
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] numbers){
        Arrays.sort(numbers);
        List<List<Integer>> resultArrayList = new ArrayList<>();
        for(int i = 0; i < numbers.length - 1; i++){
            if(i > 0 && numbers[i] == numbers[i - 1]){
                continue;
            }

            int target = -numbers[i];
            int j = i+1, k = numbers.length - 1;

            while(j < k){
                if(numbers[j] + numbers[k] == target){
                 resultArrayList.add(Arrays.asList(numbers[i], numbers[j], numbers[k]));
                    j++;
                    k--;
                    while( j < k && numbers[j] == numbers[j-1]){
                        j++;
                    }

                    while( j < k && numbers[k] == numbers[k+1]){
                        k--;
                    }
                }
                else if(numbers[j] + numbers[k] > target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return resultArrayList;

        }

    public static void main(String args[]){
        int[] inputArray = {-1, -1, 0, 1, 2};
        System.out.println(threeSum(inputArray));
    }

}

