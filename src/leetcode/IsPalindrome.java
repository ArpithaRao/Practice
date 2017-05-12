package leetcode;

/**
 * Created by ARPITHA RAO on 03-05-2017.
 */
public class IsPalindrome {

    public boolean isPalindromeBruteforce(String string){
        if(string.length() == 0) return true;
        int i =0;
        int j=string.length()-1;
        while(i<j) {
            //System.out.println(string.charAt(i) + " "+ string.charAt(j) +" "+isPalindromeBruteforce(string.substring(i+1,j)));
            if (!(string.charAt(i) == string.charAt(j) && isPalindromeBruteforce(string.substring(i+1,j)))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /*public boolean isPalindromeOptimized(String string){

        int[][] table = new int[string.length()][string.length()];
        for(int i = 0; i < string.length(); i++){
            for(int j = 0; j < string.length();j++){
                if(string.charAt(i)==string.charAt(j)){
                    table[i][j] = 1;
                }
                else table[i][j] = 0;
            }
        }
        if(string.length() == 0) return true;
        int i =0;
        int j=string.length()-1;
        while(i<j) {
            System.out.println(string.charAt(i) + " "+ string.charAt(j) +" "+table[i][j]);
            if (!(string.charAt(i) == string.charAt(j) && table[i][j]==1)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }*/

    public static void main(String args[]){
        IsPalindrome isP = new IsPalindrome();
        System.out.println(isP.isPalindromeBruteforce("cabbaabbac"));
        //System.out.println(isP.isPalindromeOptimized("cabbaabbac"));
    }

}
