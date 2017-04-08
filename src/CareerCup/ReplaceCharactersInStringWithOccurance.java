package CareerCup;

/**
 * Created by ARPITHA RAO on 25-01-2017.
 */
public class ReplaceCharactersInStringWithOccurance {
    public static void main(String[] args){
        String sampleInput = "aaabbbcccddd";
        System.out.println(replaceCharsInStirngWithOccurance(sampleInput));
    }

    public static String replaceCharsInStirngWithOccurance(String string){
        if(string == null || string.isEmpty()){
            return string;
        }

        int count = 1;

        Character current = string.charAt(0);

        StringBuilder result = new StringBuilder();

        for(int i = 1; i < string.length(); i++){
            if(string.charAt(i) == current) {
                count++;
            }
            else{
                result.append(count).append(current);
                current = string.charAt(i);
                count = 1;
            }
        }
        result.append(count).append(current);
            return  result.toString();
    }
}
