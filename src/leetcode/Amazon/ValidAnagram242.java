package leetcode.Amazon;

import java.util.Arrays;

/**
 * Created by ARPITHA RAO on 12-06-2017.
 */
public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {

        if(s==null || t == null || s.length()!=t.length()) return false;

        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        char[] temp2 = t.toCharArray();
        Arrays.sort(temp2);
        String a = new String(temp);
        String b = new String(temp2);

        if(!a.equals(b)) return false;

        return true;

    }

    public static void main(String args[]){
        ValidAnagram242 v242 = new ValidAnagram242();
        System.out.println(v242.isAnagram("abcde","abcde"));
        System.out.println(v242.isAnagram("abcde", "abcd"));
    }

}
