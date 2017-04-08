import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by ARPITHA RAO on 29-03-2016.
 *  Given the passage in textSample.txt, please remove all words that contain more than
 these letters RSTLN AEIOU and one other letter.
 Then organize the words by length and find the most common word.
 Note the letters RSTLN AEIOU and the additional letter maybe used
 multiple times in a word.
 For Example:
 "unclean" uses "N" twice, "LNAEU" are part of "RSTLN AEIOU" and has only one other letter "C", therefore this an acceptable word.
 "households" which contains "HD" has more than one letter outside of our acceptable set so it  must be removed.
 Note the d and h, where "unclean" only uses a c with the assigned set of letters
 */
public class newString {

    public static void main(String args[]) throws IOException {
        String token1 = "";

        Scanner inFile1 = new Scanner(new File("F:\\textSample.txt")).useDelimiter(" ");

        List<String> temps = new ArrayList<String>();

        while (inFile1.hasNext()) {
            token1 = inFile1.next();
            temps.add(token1);
        }
        inFile1.close();

        String[] tempsArray = temps.toArray(new String[0]);
        int counter = 0;

        HashMap<String, Integer> newMap = new HashMap<>();
       for (String temp : tempsArray) {
           // if (/*Pattern.matches("[aeiournslt]*", temp.toLowerCase())  || */Pattern.matches("[aeiournslt]+[a-z&&[^[aeiournslt]]{1}]]*", temp.toLowerCase())) {
           if (Pattern.matches("([aeiournslt]*)(.*)", temp.toLowerCase())){
                if (newMap.containsKey(temp)) {
                    counter = newMap.get(temp);
                    newMap.put(temp, counter+1);
                } else {
                    newMap.put(temp, 1);
                }
            }
        }
        System.out.println(newMap);
        Map.Entry<String, Integer> maxEntry = null;
        Integer max = Collections.max(newMap.values());

        for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
            Integer value = entry.getValue();

            if (null != value && max == value) {
                maxEntry = entry;
            }
        }
        System.out.print(maxEntry.getKey());

    }
}


