import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Created by ARPITHA RAO on 26-02-2016.
 */
public class PrintDuplicateChar {

    private static void doPrintDuplicates(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i< str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int count = 1;
                count++;
                map.put(str.charAt(i), count);

            } else {
                map.put(str.charAt(i), 1);
            }
        }
            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();

            for(Map.Entry<Character, Integer> entry: entrySet){
                if(entry.getValue()>1) {
                    System.out.printf(" %s : %d %n ", entry.getKey(), entry.getValue());
                }
            }

    }

    public static String returnrecursively(String str){
        if(str.length()<2) return str;
        return returnrecursively(str.substring(1))+str.charAt(0);
    }

    public static char firstNonRepeatedChar(String str){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char i : str.toCharArray()) {
            map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue()==1) {
                return entry.getKey();
            }
        }

        throw new RuntimeException("no non repetitive element found");
    }

    public static void patternMatcher(String str){
        // checking for non digits(\\D or [^0-9]), for digits it is \\d or [0-9]//
        Pattern pattern = Pattern.compile(".*\\D*.");
        System.out.println(pattern.matcher(str).matches());

        //checking if the number of digits are 6 in the given stirng//
        Pattern digitpattern = Pattern.compile("\\d{6}");
        System.out.println(digitpattern.matcher(str).matches());


    }

    public static void removeDuplicates(int[] a){
        int previous = a[0];
        int[] result = new int[a.length];
        result[0] = previous;

        for(int i =0; i< a.length;i++){
            if(previous!= a[i])
                result[i] = a[i];
            System.out.print(result[i]);
            previous = a[i];
        }
    }

   static int MaxRepititions(int A[], int n)
    {
        int i = 0;
        int max = 0;
        for(i = 0; i < n; i++)
        {
            A[A[i]%n] +=n;
        }
        for(i = 0; i < n; i++)
        {
            if(A[i]/n > max)
            {
                max = A[i]/n;
//               max =i;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        doPrintDuplicates("srikrsna");
      System.out.println(returnrecursively("abcdef"));
      System.out.println(firstNonRepeatedChar("shreeKrishna"));
      patternMatcher("abcdef");
      int[] a ={1,1,1,1,1,1,2,2,3,3,3};
      removeDuplicates(a);
        System.out.print(MaxRepititions(a,a.length));

    }
}
