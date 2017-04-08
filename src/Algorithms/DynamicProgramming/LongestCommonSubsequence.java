package Algorithms.DynamicProgramming;

/**
 * Created by ARPITHA RAO on 26-03-2017.
 */
public class LongestCommonSubsequence {

    public static int bottomUp(String s1, String s2){

        if(s1==null || s2 ==null) return 0;
        StringBuilder result = new StringBuilder();
        int max = 0;

        int[][] K = new int[s1.length()+1][s2.length()+1];

        for(int i = 1; i <= s1.length(); i++){
            for(int j = 1; j <= s2.length(); j++){

                if(i==0 || j==0){
                    K[i][j] = 0;
                }

                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    K[i][j] = K[i-1][j-1] + 1;
                    result.append(s1.charAt(i-1));

                }
                else{
                    K[i][j] = Math.max(K[i-1][j],K[i][j-1]);
                }

                if(max<K[i][j]){
                    max = K[i][j];
                }

            }
        }

        System.out.println(result.toString());
        return max;

    }

    public static void main(String args[]){

        //test 1
        String s1 = "abcdef";
        String s2 = "aoijbuhijf";
        System.out.println(bottomUp(s1,s2));

        //test 2
        String str1 = "ABCDGHLQR";
        String str2 = "AEDPHR";
        System.out.println(bottomUp(str1,str2));
    }

}
