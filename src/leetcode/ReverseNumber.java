package leetcode;

/**
 * Created by ARPITHA RAO on 02-01-2017.
 */
public class ReverseNumber {

    public static void main(String args[]){

        int num = 12345;
        int palindrome = 14541;
        System.out.println(isPalindrome(num));
        System.out.println(isPalindrome(palindrome));
        System.out.println(reverseNum(num));
    }

    public static int reverseNum(int num){
        if(num < 10){
            return num;
        }
        int reversedNum = 0;
        while(num % 10 != 0){
             reversedNum = reversedNum * 10 + num % 10;
            num = num / 10;
        }

        return reversedNum;
    }

    public static boolean isPalindrome(int num){

        int rev = 0;
        if(num < 0 || (num !=0 && num % 10 == 0)){
            return false;
        }

        while(num > rev){
            rev = rev * 10 +num % 10;
            num = num / 10;
        }

        return(num == rev || num == rev/10);

    }
}
