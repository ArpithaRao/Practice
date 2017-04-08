package Algorithms.DynamicProgramming;

/**
 * Created by ARPITHA RAO on 26-03-2017.
 */
public class KnapSack01 {

    public static int bottomUp(int[] val, int[] wt, int W){

        int K[][] = new int[val.length+1][W+1];

        for(int i = 0; i <= val.length; i++){
            for(int j = 0; j <= W; j++){
                if(i==0 || j==0){
                    K[i][j] = 0;
                    continue;
                }

                if(j - wt[i-1]>=0){
                    K[i][j] = Math.max(val[i-1]+K[i-1][j-wt[i-1]],K[i-1][j]);
                }
                else{
                    K[i][j] = K[i-1][j];
                }
            }
        }

        return K[val.length][W];

    }

    public static void main(String args[]){

        //test 1
        int[] val1 = {1,4,5,7};
        int[] wt1 = {1,3,4,5};
        System.out.println(bottomUp(val1, wt1, 7));

        //test 2
        int val[] = {22, 20, 15, 30, 24, 54, 21, 32, 18, 25};
        int wt[] = {4, 2, 3, 5, 5, 6, 9, 7, 8, 10};
        System.out.println(bottomUp(val, wt, 30));
    }

}
