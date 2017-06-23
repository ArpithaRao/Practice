package leetcode.Amazon.Strings.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ARPITHA RAO on 11-06-2017.
 */
public class FindAllAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result = new ArrayList<>();
        if(s==null || p == null || s.length() == 0 || p.length() == 0) return result;
        if(p.length() > s.length()) return result;

        Map<Character, Integer> map = new HashMap<>();

    for(char c:p.toCharArray()){
        map.put(c, map.getOrDefault(c,0)+1);
    }

    int end = 0, start = 0, counter = map.size();

    while(end < s.length()){
        char temp1 = s.charAt(end);
        if(map.containsKey(temp1)){
            map.put(temp1, map.get(temp1)-1);
            if(map.get(temp1)==0){
                counter--;
            }
        }
        end++;
        while(counter == 0){
            char temp2 = s.charAt(start);
            if(map.containsKey(temp2)){
                map.put(temp2, map.get(temp2)+1);
                if(map.get(temp2)>0){
                    counter++;
                }
            }

            if(end - start == p.length()){
                result.add(start);
            }

            start++;

        }
    }

    return result;
}

    public static void main(String args[]){
        FindAllAnagrams fa = new FindAllAnagrams();
        System.out.println(fa.findAnagrams("cbaebabacd","abc"));
    }
}
