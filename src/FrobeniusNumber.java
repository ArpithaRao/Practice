/**
 * Created by ARPITHA RAO on 02-03-2016.
 */

// the Frobenius number formula: mn – m – n
/*Frobenius number definition: Given 2 positive integers: m, n
        such that gcd(m, n) = 1
        find the largest integer that CANNOT be achieved using below expression:
        am + bn,    where a, b are non-negative integers. Total such numbers: (m-1)(n-1)/2*/


public class FrobeniusNumber {
    static int gcd(int a, int b)
    {
        int c;
        while (a != 0)
        {
            c = a;
            a = b%a;
            b = c;
        }
        return b;
    }
    static void forbenius(int X,int Y)
    {
        // Solution doesn't exist if GCD is
        // not 1
        if (gcd(X,Y) != 1)
        {
            System.out.print("NA\n");
            return;
        }

        // Else apply the formula
        int A = (X*Y)-(X+Y);
        int N = (X-1)*(Y-1)/2;

       System.out.println("Largest Number "+ A);
        System.out.println("Total such numbers " + N);
    }
    //driver function
    public static void main(String args[]){
        forbenius(2, 5);
        forbenius(5, 10);
    }
}
