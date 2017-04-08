package leetcode;

/**
 * Created by ARPITHA RAO on 10-01-2017.
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        StringBuilder lcp=new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            for(String s:strs){
                if(s.length()<i+1||c!=s.charAt(i)) return lcp.toString();
            }
            lcp.append(c);
        }
        return lcp.toString();
    }

    public static void main(String srgs[]){
        String[] stringList = {"abc", "abcde", "abcdef"};
        System.out.println(longestCommonPrefix(stringList));
    }

}
