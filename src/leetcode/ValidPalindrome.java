package leetcode;

/**
 * Created by ARPITHA RAO on 11-04-2017.
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s){
       int i = 0, j = s.length()-1;
        while (i<j){
           while(i<j && (!Character.isLetterOrDigit(s.charAt(i))) )i++;
            while(i<j &&(!Character.isLetterOrDigit(s.charAt(j)))) j--;

            if(Character.toLowerCase(s.charAt(i))
                    != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String args[]){
        String s = "A man, a plan, a canal: Panama";
        String s1 = "race a car";
        ValidPalindrome vp =  new ValidPalindrome();
        System.out.println(vp.isPalindrome(s));
        System.out.println(vp.isPalindrome(s1));
    }

}
