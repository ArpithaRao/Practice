package leetcode;

/**
 * Created by ARPITHA RAO on 03-01-2017.
 */
public class IntToRoman {

    public static void main(String args[]){
        int test1 = 1000;
        int test2 = 900;
        int test3 = 459;
        int test4 = 25;

        System.out.println(intToRoman(test1));
        System.out.println(intToRoman(test2));
        System.out.println(intToRoman(test3));
        System.out.println(intToRoman(test4));
    }

    public static String intToRoman(int num){
        int intValues[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String romanValues[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < intValues.length; i++){
            while(num >= intValues[i]){
                num -= intValues[i];
                sb.append(romanValues[i]);
            }
        }
        return sb.toString();
    }
}
