package Algorithms.DynamicProgramming;

/**
 * Created by ARPITHA RAO on 29-03-2017.
 */
public class MinEditDistance {

    //bottom up
    public static int findMinEditDistance(String s1, String s2){

        if(s1 == null && s2 == null) return 0;
        if(s1 == null) return s2.length();
        if(s2 == null) return s1.length();

        int[][] T = new int[s1.length()+1][s2.length()+1];

        for(int i = 0; i <T[0].length; i++){
            T[0][i] = i;
        }

        for(int i = 0; i <T.length; i++){
            T[i][0] = i;
        }
        for(int i = 1; i <=s1.length(); i++){
            for(int j = 1; j <=s2.length(); j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    T[i][j] = T[i-1][j-1];
                }
                else{
                    T[i][j] = Math.min(T[i-1][j],Math.min(T[i][j-1],T[i-1][j-1])) + 1;
                }
            }
        }

        for(int i = 0; i < s1.length(); i++){
            System.out.println();
            for(int j = 0; j < s2.length(); j++){
                System.out.print(T[i][j] + " ");
            }
        }
        System.out.println("Min Edit Distance");
        return T[s1.length()][s2.length()];

    }

    public static void main(String args[]){
        String s1 = "abcdef";
        String s2 = "azcef";
        System.out.println(findMinEditDistance(s2,s1));
    }

}
