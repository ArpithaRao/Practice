package Algorithms.DynamicProgramming;

/**
 * Created by ARPITHA RAO on 30-03-2017.
 */
public class LongestPalindromicSubsequence {

    public static int lengthofLongestPalinSubsequence(String s){

        if(s==null) return 0;
        if(s.length()==1) return 1;

        int[][] T = new int[s.length()+1][s.length()+1];

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < s.length(); j++){
                    T[i][j] = 1;
            }
        }

        for(int l = 1; l < s.length(); l++){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == s.charAt(l)){
                    T[i][l] = T[i + 1][l-1] + 2;
                }else{
                    T[i][l] = Math.max(T[i + 1][l], T[i][l - 1]);
                }
            }
        }

        for(int i = 0; i <s.length(); i++){
            System.out.println();
            for(int j = 0; j <s.length(); j++){

                System.out.print(T[i][j]+" ");


            }
        }
        return T[0][s.length()-1];
    }

    public static void main(String args[]){
        String s = "agbdba";
        System.out.println(lengthofLongestPalinSubsequence(s));
    }
}
