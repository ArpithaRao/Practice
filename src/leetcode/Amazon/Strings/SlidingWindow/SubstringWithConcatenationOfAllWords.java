package leetcode.Amazon.Strings.SlidingWindow;

import java.util.*;

/**
 * Created by ARPITHA RAO on 11-06-2017.
 */
public class SubstringWithConcatenationOfAllWords {

    //not correct solution
    public List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> res = new ArrayList<>();
        if(s == null || words.length == 0 || s.length() == 0 || s.length() < words.length * words[0].length()) return res;

        Set<String> set = new HashSet<>();
        for(String str:words){
            set.add(str);
        }

        StringBuilder sb = new StringBuilder();

        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            sb.append(iter.next());
        }

        System.out.println(sb.toString());

        int length = sb.length();

        for(int i = 0; i < s.length()-length+1; i++){
            if(s.substring(i, i + length).equals(sb.toString())){
                res.add(i);
            }
        }
        return res;
    }


    //To Do
    //correct solution

    public static void main(String args[]){
        SubstringWithConcatenationOfAllWords swc = new SubstringWithConcatenationOfAllWords();
        String[] input = {"foo", "bar"};
        System.out.println(swc.findSubstring("barfoothefoobarman", input));
    }

}
