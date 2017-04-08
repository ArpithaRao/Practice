package Algorithms.DynamicProgramming;

/**
 * Created by ARPITHA RAO on 26-03-2017.
 */
public class SubsetSum {

    public static boolean bottomUp(int[] input, int sum){
        if(input.length == 0) return false;

        boolean[][] array = new boolean[input.length+1][sum+1];

        for(int i = 0; i < input.length; i++){

                array[i][0] = true;

        }

        for(int i = 1; i <= input.length; i++){
            for(int j = 1; j<= sum; j++){
                if(j - input[i-1] >=0){
                        array[i][j] = array[i-1][j] || array[i-1][j-input[i-1]];
                }
                else{
                        array[i][j] = array[i-1][j];
                }

            }
        }
        return array[input.length][sum];
    }

    public static void main(String args[]){
        int[] input = {2,3,7,8,10};
        int sum = 11;
        System.out.println(bottomUp(input,sum));
    }
}
