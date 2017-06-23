package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by ARPITHA RAO on 12-06-2017.
 */
public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int count = 0;
        Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            if(Integer.valueOf((int) pair.getValue())%2 !=0) count++;
        }

        if (count == 1 || count == 0) return true;

        return false;

    }

    public static void main(String args[]){
        PalindromePermutation pp = new PalindromePermutation();
        System.out.println(pp.canPermutePalindrome("aab"));
        System.out.println(pp.canPermutePalindrome("amb"));
    }

}
