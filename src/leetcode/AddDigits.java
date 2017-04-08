package leetcode;

/**
 * Created by ARPITHA RAO on 05-03-2017.
 */
public class AddDigits {
    public static int addDigits(int num){
        if(num == 0) return 0;
        int sum = 0;
        int newSum = 0;
        int digit = 0;
        while(num > 0) {

            digit = num % 10;
            sum = sum + digit;
            num = num/10;
        }

        if(sum > 9) {

            while (sum > 0) {
                digit = sum % 10;
                newSum = newSum + digit;
                sum = sum / 10;
            }

            sum = newSum;
        }

        return sum;
    }

    public static int addDigitsOneLine(int num){

        int val =  (num!=0 && num%9==0) ? 9 : num%9;

        return val;
    }

    public static void main(String args[]){
       /* System.out.println(addDigits(321));
        System.out.println(addDigits(999));

        System.out.println("-----------------------------");*/

//        System.out.println(addDigitsOneLine(321));
        System.out.println(addDigitsOneLine(999));
    }

}
