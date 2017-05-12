package leetcode;

import java.util.Random;

/**
 * Created by ARPITHA RAO on 03-05-2017.
 */
public class SelectRandomNumberInArray {

    public int selectRandomNumber(int[] num){
        if(num.length == 0) return 0;
        return num[new Random().nextInt(num.length)];
    }

    public static void main(String args[]){
        /*int[] input = new int[100];
        for(int i = 0; i < input.length; i++){
            input[i] = new Random().nextInt(1000);
        }*/

        int[] input = {1,2,3,4,5,1,2,3,4};
        int[] freq = {2,2,2,2,1};
        SelectRandomNumberInArray selectRandomNumberInArray = new SelectRandomNumberInArray();
        System.out.println(selectRandomNumberInArray.selectRandomNumber(input));

    }

}
