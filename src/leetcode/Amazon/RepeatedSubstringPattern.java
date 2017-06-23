package leetcode.Amazon;

/**
 * Created by ARPITHA RAO on 12-06-2017.
 */
public class RepeatedSubstringPattern {

    public boolean findIfRepeatedSubstringPatternExists(String s) {
        int length = s.length();
        for(int i = length/2; i >=1; i--){
            if(length%i == 0) {
                int m = length/i;
                String temp = s.substring(0, i);
                int j;
                for(j = 1; j < m; j++){
                   if(!temp.equals(s.substring(j*i, i+ j*i))) break;
                }
                if(j==m) return true;
            }
        }
        return false;
    }

    public static void  main(String args[]){

        RepeatedSubstringPattern rsp = new RepeatedSubstringPattern();
        System.out.println(rsp.findIfRepeatedSubstringPatternExists("abab"));

    }

}
