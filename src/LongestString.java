/**
 * Created by ARPITHA RAO on 26-01-2016.
 */
public class LongestString {


        public static String getLongestString(String[] array) {
            int maxLength = 0;
            String longestString = null;
            for (String s : array) {
                if (s.length() > maxLength) {
                    maxLength = s.length();
                    longestString = s;
                }
            }
            return longestString;
        }

        public static void main(String[] args) {
            String[] toppings = {"Cheese", "Pepperoni ", "Black Olives"};
            String longestString = getLongestString(toppings);
            System.out.format("longest string: '%s'\n", longestString);
        }

    }


