/**
 * Created by ARPITHA RAO on 10-03-2016.
 */
public class AllPalindromes {
    public static boolean isPalindrome(String str){
        for(int i=0;i<=str.length()/2;i++)
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
                return false;
        return true;
    }

    public static void AllPalindrome(String str){
        int count = 0;
        int longestPalindromeLength = 0;
        for(int i=0; i< str.length(); i++){
            for(int j = i; j< str.length(); j++){
                if(isPalindrome(str.substring(i, j+1))) {
                    count++;
                    System.out.println(str.substring(i, j+1));
                    if(str.substring(i, j+1).length() > longestPalindromeLength){
                        longestPalindromeLength = str.substring(i, j+1).length();
//                        System.out.println("Longest Palindrome is: "+str.substring(i, j+1));
                    }
                }
            }
        }
        System.out.println("Number of palindromes "+ count);
        System.out.println("Length of longest palindrome is: "+longestPalindromeLength);
    }

    public static void main(String args[]){
        String str = "HellolleH";
        //isPalindrome(str);
        AllPalindrome(str);
    }
}
