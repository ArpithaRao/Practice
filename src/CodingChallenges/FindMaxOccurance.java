package CodingChallenges;

import java.util.HashMap;

/**
 * Created by ARPITHA RAO on 25-04-2017.
 */
public class FindMaxOccurance {

    public int maxOccurance(String s){
        if(s == null || s.length() == 0) return 0;

        int max = Integer.MIN_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int count = map.get(s.charAt(i))+1;
                if(count > max){
                    max = count;
                }
                map.put(s.charAt(i),count);
            }
            else{
                max = 1;
                map.put(s.charAt(i),1);
            }
        }

        return max;
    }

    public static void main(String args[]){

        FindMaxOccurance findMaxOccurance = new FindMaxOccurance();
        int count = findMaxOccurance.maxOccurance("");
        System.out.println("max occurance of one char "+count);

    }

}
