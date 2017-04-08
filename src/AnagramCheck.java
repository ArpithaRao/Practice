import java.util.Arrays;

/**
 * Created by ARPITHA RAO on 26-02-2016.
 */
public class AnagramCheck {

    public static boolean isAnagram(String str1, String str2){
        if(str1.length()!= str2.length()) return false;

        char [] ch1 = str1.toLowerCase().toCharArray();
        char [] ch2 = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    public static void main(String args[]){
        System.out.print(isAnagram("Srikrsna","krsnaSri"));
    }
}
