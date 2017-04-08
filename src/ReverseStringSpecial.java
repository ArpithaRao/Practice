/**
 * Created by ARPITHA RAO on 02-03-2016.
 */
public class ReverseStringSpecial {

    public static void main(String args[]) {

        System.out.println(reverseString("***erahe#raha@nsrk***"));
    }


    private static String reverseString(String input) {
        char[] inputArray = input.toCharArray();
        char[] newArray = new char[input.length()];
        int i = 0;
        int j = 0;
        for (char ch : inputArray) {
            if (Character.isAlphabetic(ch)) {
                newArray[i] = ch;
                i++;
            }
        }
        i--;
        char temp;
        // reversing a string
        while (j < i) {
            temp = newArray[i];
            newArray[i] = newArray[j];
            newArray[j] = temp;
            j++;
            i--;
        }

        for (i = 0, j = 0; i < inputArray.length; i++) {
            if (Character.isAlphabetic(inputArray[i])) {
                inputArray[i] = newArray[j++];
            }
        }
        return new String(inputArray);
    }
}
