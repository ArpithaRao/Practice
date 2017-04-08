import java.util.*;

/**
 * Created by ARPITHA RAO on 04-02-2016.
 */
public class FindAnagrams {
    final Map<String, List<String>> lookup = new HashMap<>();

    public FindAnagrams(final List<String> words) {

        for (final String word : words) {
            final String signature = alphabetize(word);
            if (lookup.containsKey(signature)) {
                lookup.get(signature).add(word);
            } else {
                final List<String> anagramList = new ArrayList<>();
                anagramList.add(word);
                lookup.put(signature, anagramList);
            }
        }
    }
    private String alphabetize(final String word) {
        final byte[] bytes = word.getBytes();
        Arrays.sort(bytes);
        return new String(bytes);
    }
    public List<String> getAnagrams(final String word) {
        final String signature = alphabetize(word);
        final List<String> anagrams = lookup.get(signature);
        return anagrams == null ? new ArrayList<>() : anagrams;
    }

    public static void main(String args[]){

    }
}
