package Algorithms.DynamicProgramming;

/**
 * Created by ARPITHA RAO on 30-03-2017.
 */
public class CoinChangingNumber {

    public static int findWays(int[] coins, int total){

        int[][] T = new int[coins.length+1][total+1];

        for(int i = 0; i <coins.length+1; i++){
                T[i][0] = 1;
            }

        for(int i = 1; i <=coins.length; i++){
            for(int j = 1; j <=total; j++){
                if(coins[i-1]>j){
                    T[i][j] = T[i-1][j];

                }
                else{
                    T[i][j] = T[i-1][j] + T[i][j-coins[i-1]];
                }
            }
        }

        for(int i = 0; i <=coins.length; i++){
            System.out.println();
            for(int j = 0; j <= total; j++){
                System.out.print(T[i][j] + " ");
            }
        }
        return T[coins.length][total];
    }

    public static void main(String args[]){
        int[] coins = {1,2,3};
        int total = 5;
        System.out.println(findWays(coins,total));
    }
}
