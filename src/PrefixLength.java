/*

 * Created by ARPITHA RAO on 27-01-2016.

*/
public class PrefixLength {

    public static void main(String args[]) {
        System.out.println(PrefixLength("interspecies", "interstellar", "interstate"));
    }

    public static String PrefixLength(String... list) {
        if (list == null) return "";
        String ret = "";
        int index = 0;
        int q = 0;
        String[] listContents = new String[q];

        while (true) {
            char thisLetter = 0;

            for (String word : list) {
                if (index == word.length()) return ret;// end of word
                if (thisLetter == 0) {
                    thisLetter = word.charAt(index);
                }
                if (thisLetter != word.charAt(index)) {
                    return ret;
                }

            }
            ret += thisLetter;
            index++;
        }

    }
}

