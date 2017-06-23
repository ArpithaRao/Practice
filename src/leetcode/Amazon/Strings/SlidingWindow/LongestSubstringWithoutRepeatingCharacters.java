package leetcode.Amazon.Strings.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ARPITHA RAO on 09-06-2017.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s){

        Map<Character, Integer> map = new HashMap<>();
        int start = 0, end = 0, counter = 0, d = 0;

        while(end<s.length()){
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c,0)+1);
            if(map.get(c) > 1) counter++;
            end++;

            while(counter > 0){
                char temp = s.charAt(start);
                if(map.get(temp)>1) counter--;
                map.put(temp, map.getOrDefault(temp, 0)-1);
               start++;
            }
            d = Math.max(d, end-start);
        }
        return d;
    }

    public static void main(String srags[]){
        LongestSubstringWithoutRepeatingCharacters lbw = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(lbw.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lbw.lengthOfLongestSubstring("bbbbb"));
        System.out.println(lbw.lengthOfLongestSubstring("pwwkew"));
    }

}
