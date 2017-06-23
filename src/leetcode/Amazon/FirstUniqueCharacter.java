package leetcode.Amazon;

/**
 * Created by ARPITHA RAO on 12-06-2017.
 */
public class FirstUniqueCharacter {

    public int firstUniqChar(String s){
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i = 0; i < s.length(); i ++){
            if(freq[s.charAt(i)-'a'] == 1) return i;
        }
        return -1;
    }

    public static void main(String args[]){
        FirstUniqueCharacter fu = new FirstUniqueCharacter();
        System.out.println("answer "+fu.firstUniqChar("loveleetcode"));
    }

}
