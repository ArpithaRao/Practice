package Algorithms.DynamicProgramming;

/**
 * Created by ARPITHA RAO on 20-03-2017.
 */
public class FibonacciBottomUp {

    public static int fibonacci(int n){

        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        int i;
        for(i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    public static void main(String args[]){

        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(9));

    }

}
