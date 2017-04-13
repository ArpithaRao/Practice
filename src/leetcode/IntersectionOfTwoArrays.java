package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ARPITHA RAO on 11-04-2017.
 */
public class IntersectionOfTwoArrays {
    public int[] findIntersection(int[] array1, int[] array2){
        Arrays.sort(array1);
        Arrays.sort(array2);
        ArrayList<Integer> result = new ArrayList<>();



       for( int i = 0;i<array1.length;i++){
            for( int j = 0;j<array2.length;j++){

                while (i<array1.length-1&& array1[i] == array1[i+1]) i++;
                while (j<array2.length-1 && array2[j] == array2[j+1]) j++;
                if(array1[i] == array2[j]) {
                    result.add(array1[i]);
                }
            }
        }
        int[] output = new int[result.size()];
        for (int k = 0; k<result.size();k++){
            output[k] = result.get(k);
        }

        return output;
    }

    public static void main(String args[]){
        int[] array1 = {1, 2, 2, 3,3,4,9};
        int[] array2 = {0,0,1,1,2,7,9};
        IntersectionOfTwoArrays ia = new IntersectionOfTwoArrays();
        int[] res = ia.findIntersection(array1,array2);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i]+" ");
        }
    }

}
