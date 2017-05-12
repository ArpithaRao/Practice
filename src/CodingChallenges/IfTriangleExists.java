package CodingChallenges;

import java.util.Arrays;

/**
 * Created by ARPITHA RAO on 02-05-2017.
 */
public class IfTriangleExists {

    /*overall time complexity in O(n^2)*/
    public boolean isTrianglePresent(int[] array){
        if(array.length < 3) return false;
        Arrays.sort(array);//O(n log n)
        for(int i = 0; i < array.length; i++){
            int j = i+1;
            int k = array.length -1;
            while(j<k){
                if((array[i]+array[j]) >= array[k]){
                    return true;
                }
                else k--;
                j++;
                k--;
            }
        }
        return false;
    }

    public static void main(String args[]){

        IfTriangleExists te = new IfTriangleExists();

        //test case 1
        int[] input = {0,0,1};

        System.out.println(te.isTrianglePresent(input));

        //test case2
        int[] input2 = {1,1,1};

        System.out.println(te.isTrianglePresent(input2));

        //test case3
        int[] input3 = {1,5,10,48,12,32,6,7};

        System.out.println(te.isTrianglePresent(input3));
    }

}
