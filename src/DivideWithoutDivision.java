/**
 * Created by ARPITHA RAO on 05-03-2016.
 */
public class DivideWithoutDivision {

    public static void main(String args[]){
        int denominator = 2;
        int numerator = 10;
       System.out.print(divide(numerator,denominator));

    }

    private static int divide(int numerator, int denominator){
        if(denominator== 0|| denominator> numerator) throw new IllegalArgumentException();
        int mask =0X1;
        int quotient = 0;

        while(numerator >= denominator){
            denominator<<=1;
            mask<<=1;
        }
        while(mask > 1){
            denominator>>=1;
            mask>>=1;
            if(numerator >= denominator) {
                numerator -= denominator;
                quotient |= mask;
            }
        }
        return quotient;
    }

}
