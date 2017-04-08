package Algorithms.DynamicProgramming;

import java.util.ArrayList;

/**
 * Created by ARPITHA RAO on 05-04-2017.
 */
public class CuttingRod {

    public static int maxProfit(int[] lengths, int[] cost, int totalLength){

        int[][] T = new int[lengths.length+1][totalLength+1];

        for(int i = 0; i <lengths.length+1; i++){
            T[i][0] = 0;
            T[0][i] = 0;
        }

        ArrayList<Integer> cuts = new ArrayList<>();

        for(int i = 1; i <=lengths.length; i++){

            for(int j =1; j <=totalLength; j++){
                if(j>=i){

                    if(T[i-1][j] < T[i][j-i]+cost[i-1] )

                    {
                        T[i][j] = T[i][j - i] + cost[i - 1];
                        //cuts.add(i);
                    }
                    else {
                        T[i][j] = T[i-1][j];
                    }
                }
                else{
                    T[i][j] = T[i-1][j];
                }
            }
        }

        for(int i = 1; i <=lengths.length; i++){
            System.out.println();
            for(int j =1; j <=totalLength; j++) {
                System.out.print(T[i][j] + " ");
            }
        }

        /*for(int i = 0; i <cuts.size(); i++){
            System.out.print(cuts.get(i)+" ");
        }*/

        System.out.println();
        return T[lengths.length][totalLength];

    }

    public static void main(String args[]){
        int totalLength = 5;
            int[] lengths = {1, 2, 3, 4};
            int[] cost = {2,5,7,8};
        System.out.println(maxProfit(lengths, cost, totalLength));
    }

}
