package Algorithms.DynamicProgramming;

import java.util.ArrayList;

/**
 * Created by ARPITHA RAO on 27-03-2017.
 */
public class LongestIncreasingSubsequence {

    private static ArrayList<Integer> result = new ArrayList<>();

    public static int botoomUp(int[] arr){

        int[] T = new int[arr.length+1];

        for(int i = 0; i < T.length; i++){
            T[i] = 1;
        }

        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                if(arr[j]<arr[i]){
                    T[i] = Math.max(T[i], T[j]+1);
                }
            }
        }

        int max = 0;


        int maxIndex = 0;
        int k = 0;
        for(k = 0; k < T.length-1; k++){
            if(T[k]>max) {
                max = T[k];
                maxIndex = k;
            }
        }
        result.add(arr[maxIndex]);
        for(int i = maxIndex; i>0; ){
            if(arr[i-1]<arr[i]){
                result.add(arr[i-1]);
            }
            i--;
        }
        System.out.println(result);
        return max;
    }

    public static void main(String args[]){
        int[] arr ={3, 4, -1, 0, 6, 2, 3};
        System.out.println(botoomUp(arr));
    }

}
