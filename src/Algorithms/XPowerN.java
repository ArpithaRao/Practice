package Algorithms;

/**
 * Created by ARPITHA RAO on 11-03-2017.
 */
public class XPowerN {

    public static double findXPowerN(int x, int n){
        if(x == 0) return 0;
        if(x == 1) return 1;
        if(n == 0) return 1;
        if(n == 1) return x;

        double result = findXPowerN(x, n-1) * x;
        return result;

    }

    public static void main(String args[]){
        System.out.println("x power n:");
        System.out.println(findXPowerN(100, 25));
    }

}
