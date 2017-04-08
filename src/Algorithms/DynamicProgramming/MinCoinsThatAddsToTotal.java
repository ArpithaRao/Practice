package Algorithms.DynamicProgramming;

import java.util.ArrayList;

/**
 * Created by ARPITHA RAO on 27-03-2017.
 */
public class MinCoinsThatAddsToTotal {

    public static int bottomUp(int[] input, int total){

        int[] T = new int[total+1];
        int[] R = new int[total+1];

        T[0] = 0;

        for(int i=1; i<=total;i++){
            T[i] = Integer.MAX_VALUE-1;
        }
        for(int j = 0; j < input.length; j++){
            for(int i = 1; i <= total; i++){

                if(i >= input[j]){
                    if(T[i-input[j]]+1< T[i]){
                        T[i] = T[i-input[j]]+1;
                        R[i] = j;
                    }
                }
            }
        }

        printCoins(R,input,total);
        return T[total];
    }

    public static void printCoins(int[] R, int[] input, int total){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(input[R[R.length-1]]);
        int i = R.length;
        while(i>=0){
            int temp = total - res.get(res.size()-1);
            res.add(temp);
            i--;
            break;
        }
        System.out.println(res);
    }

    public static void main(String args[]){
        int[] coins = {7,2,3,6};
        int total = 13;
        System.out.println(bottomUp(coins,total));
    }

}
