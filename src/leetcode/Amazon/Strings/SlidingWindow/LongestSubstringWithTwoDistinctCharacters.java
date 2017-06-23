package leetcode.Amazon.Strings.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ARPITHA RAO on 11-06-2017.
 */
public class LongestSubstringWithTwoDistinctCharacters {

    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int start = 0, end = 0, counter = 0, length = 0;
        Map<Character, Integer> map = new HashMap<>();

        while(end < s.length()){
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c,0)+1);
            if(map.get(c)==1) counter++;
            end++;

            while(counter > 2){
                char a = s.charAt(start);
                map.put(a, map.getOrDefault(a,0)-1);
                if(map.get(a)==0) counter--;
                start++;
            }
            length = Math.max(length, end - start);
        }

        return length;
    }

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(s.length() == 0 || k == 0) return 0;
        int counter = 0, start = 0, end = 0, length = 0;
        Map<Character, Integer> map = new HashMap<>();

        while(end < s.length()){
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c,0)+1);
            if(map.get(c)==1) counter++;
            end++;

            while(counter > k){
                char a = s.charAt(start);
                map.put(a, map.getOrDefault(a,0)-1);
                if(map.get(a)==0) counter--;
                start++;
            }
            length = Math.max(length, end -start);
        }

        return length;

    }

    public static void main(String args[]){
        LongestSubstringWithTwoDistinctCharacters lsc = new LongestSubstringWithTwoDistinctCharacters();
        System.out.println(lsc.lengthOfLongestSubstringTwoDistinct("eceba"));
        System.out.println(lsc.lengthOfLongestSubstringKDistinct("eceba",2));
    }

}
