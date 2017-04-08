package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by ARPITHA RAO on 12-01-2017.
 */
public class LetterCombinations {

    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static Queue<String> letterCombinations(String digits) {

        Queue<String> ans = new LinkedList<>();
        List<Integer> a = new ArrayList<Integer>();

        if(digits.length() == 0){
            return ans;
        }

        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length()==i){
                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
        }
        return ans;
    }

    public static void main(String args[]){
        String phoneNumbers = "23";
        String phoneNumbers1 = "";
        System.out.println(letterCombinations(phoneNumbers));
        System.out.println(letterCombinations(phoneNumbers1));
    }

}
