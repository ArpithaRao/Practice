package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ARPITHA RAO on 12-06-2017.
 */
public class LongestPalindrome409 {
    public int findLongestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length();i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                count++;
            }
            else{
                set.add(s.charAt(i));
            }

        }
        if(!set.isEmpty()) return 2* count +1;
        return 2* count;
    }

    public static void main(String args[]){
        LongestPalindrome409 lp409 = new LongestPalindrome409();
        System.out.println(lp409.findLongestPalindrome("bananas"));
    }

}
