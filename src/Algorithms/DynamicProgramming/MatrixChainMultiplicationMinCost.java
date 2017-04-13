package Algorithms.DynamicProgramming;

/**
 * Created by ARPITHA RAO on 26-03-2017.
 */
public class MatrixChainMultiplicationMinCost {


    public int bottomUp(int[] input) {

        int[][] T = new int[input.length][input.length];

        for (int i = 0; i <T.length; i++) {
            for (int j = 0; j <T.length; j++) {
                T[i][j] = 10000;
            }
        }

        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                for (int k = 0; k < input.length; k++) {
                        T[i][j] = Math.min(T[i][j], (T[i][k]+T[k+1][j]+(input[i]*input[k]*input[k])));
                }
            }
        }

        for (int i = 0; i <T.length; i++) {
            System.out.println();
            for (int j = 0; j < T.length; j++) {
                System.out.print(T[i][j] + " ");
            }
        }

        return T[0][T[0].length - 1];
    }

    public static void main(String args[]){

        MatrixChainMultiplicationMinCost mc = new MatrixChainMultiplicationMinCost();
        int input[] = {2,3,6,4,5};
        int minCost = mc.bottomUp(input);
        System.out.println(minCost);

    }

    }
