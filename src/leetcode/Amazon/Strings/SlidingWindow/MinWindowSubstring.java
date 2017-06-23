package leetcode.Amazon.Strings.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ARPITHA RAO on 06-06-2017.
 */
public class MinWindowSubstring {
        public String minWindow(String s, String t) {

            if(t.length()>s.length()) return "";

            Map<Character, Integer> map = new HashMap<>();

            for(char temp: t.toCharArray()){
                map.put(temp, map.getOrDefault(temp, 0)+1);
            }

            int counter = map.size();
            int begin =0, end = 0;
            int head = 0;
            int length = Integer.MAX_VALUE;

            while(end < s.length()){
                char c = s.charAt(end);
                if(map.containsKey(c)){
                    map.put(c, (map.get(c)-1));
                    if(map.get(c) == 0){
                        counter--;
                    }
                }
                end++;

                while(counter == 0){
                    char a = s.charAt(begin);
                    if(map.containsKey(a)){
                        map.put(a, (map.get(a)+1));
                        if(map.get(a)>0){
                            counter++;
                        }
                    }
                    System.out.println("len "+length);
                    if((end - begin) < length){
                        length = end - begin;
                        head = begin;
                    }
                    begin++;
                }
            }
            if(length == Integer.MAX_VALUE) return "";
            System.out.println("head "+head);
            System.out.println("len "+length);
            System.out.println("head+len "+(head+length));
            return s.substring(head, head+length);
        }

    public static void main(String args[]){
        MinWindowSubstring mnw = new MinWindowSubstring();
        System.out.println(mnw.minWindow("abc", "ab"));
    }
}
