package leetcode;

/**
 * Created by ARPITHA RAO on 01-01-2017.
 */
public class StringToIntegerAtoi {

    public static void main(String args[]){
        String sample1 = " ";
        String sample2 = "    123   ";
        String sample3 = "+159";
        String sample4 = "  -126 ";
        String sample5 = "2,147,483,648";
        String sample6 = "-2,147,483,650";

        System.out.println(myAtoi(sample1));
        System.out.println(myAtoi(sample2));
        System.out.println(myAtoi(sample3));
        System.out.println(myAtoi(sample4));
        System.out.println(myAtoi(sample5));
        System.out.println(myAtoi(sample6));
        /*System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);*/

    }

    public static int myAtoi(String str) {

         //1. checking for null or no valid str;
         if(str == null || str.length() == 0 || str == " "){
             return 0;
         }


        int sign = 1;
        long sum = 0;
        int start = 0;


        //2. removing initial and trialing white spaces if any
        str = str.trim();

        char firstChar = str.charAt(0);

        //3. sign check
        if(firstChar == '+'){
            sign = 1;
            start++;
        }
        else if(firstChar == '-'){
            sign = -1;
            start++;
        }

        //4. overflow checking and atoi
        for(int i = start; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                return (int) sum * sign;
            }
            sum = sum * 10 + str.charAt(i) - '0';

            //overflow check
            if(sign == 1 && sum > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
            }

            else if(sign == -1 && (-1) * sum < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
            }
        }

        return (int) sum * sign;

    }

   /* public static int myAtoi(String str) {
        if (str == null || str.length() == 0 || str == " ")
            return 0;//
        str = str.trim();
        char firstChar = str.charAt(0);
        int sign = 1, start = 0, len = str.length();
        long sum = 0;
        if (firstChar == '+') {
            sign = 1;
            start++;
        } else if (firstChar == '-') {
            sign = -1;
            start++;
        }
        for (int i = start; i < len; i++) {
            if (!Character.isDigit(str.charAt(i)))
                return (int) sum * sign;
            sum = sum * 10 + str.charAt(i) - '0';
            if (sign == 1 && sum > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }

        return (int) sum * sign;
    }*/

}
