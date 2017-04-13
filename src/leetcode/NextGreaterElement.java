package leetcode;

/**
 * Created by ARPITHA RAO on 11-04-2017.
 */
public class NextGreaterElement {

  /*  public int[] findNextGreaterElement(int[] input1, int[] input2){

        for(int i = 0; i < input2.length; i++){
            if()
        }

    }*/

    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }

    public static void main(String args[]){
        String haystack = "aaaba";
        String needle = "ba";

        NextGreaterElement ng = new NextGreaterElement();
        int res = ng.strStr(haystack,needle);
        System.out.println(res);

    }

}
