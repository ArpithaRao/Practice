package GeeksForGeeks;

/**
 * Created by ARPITHA RAO on 20-03-2017.
 */
public class CheckDivisibility11 {

    public static boolean isNumberDivisibleBy11(long num){
       boolean flag = false;
        long odd = 0;
        long even  = 0;
        long remainder = 0;
        while(num > 0) {
            if (!flag) {
                remainder = num % 10;
                odd += remainder;
                flag = true;
                remainder = 0;
                num = num / 10;
            }
            if (flag) {
                remainder = num % 10;
                even += remainder;
                flag = false;
                remainder = 0;
                num = num / 10;

            }
        }
        if (odd > even) {
            if (odd - even % 11 == 0) return true;
        } else if (odd < even) {
            if (even - odd % 11 == 0) return true;
        } else if(odd == even) return true;
        return false;
    }

    public static void main(String args[]){
        System.out.println(isNumberDivisibleBy11(121));
        System.out.println(isNumberDivisibleBy11(100));
        System.out.println(isNumberDivisibleBy11(1331));
//        System.out.println(isNumberDivisibleBy11(363588395960667043875487));
    }

}
