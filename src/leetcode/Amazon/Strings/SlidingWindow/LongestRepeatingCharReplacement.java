package leetcode.Amazon.Strings.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ARPITHA RAO on 11-06-2017.
 */
public class LongestRepeatingCharReplacement {
    public int characterReplacement(String s, int k) {

        int start = 0, end = 0, max = 0, counter = 0;
        Map<Character, Integer> map = new HashMap<>();

        while(end < s.length()){
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c,0)+1);
            if(counter < map.get(c)) counter = map.get(c);
            end++;
            while(!(end - start - counter <= k)){
                char a = s.charAt(start);
                map.put(a, map.getOrDefault(a,0)-1);
                counter = getMax(map);
                start++;
            }
            max = Math.max(max, end-start);
        }
        return max;
    }

    public int getMax(Map<Character, Integer> map) {
        int max = 0;
        for (int temp : map.values()) {
            max = Math.max(max, temp);
        }
        return max;
    }

    public static void main(String args[]){
        LongestRepeatingCharReplacement lrcr = new LongestRepeatingCharReplacement();
        System.out.println(lrcr.characterReplacement("AABABBA",1));
    }

}
