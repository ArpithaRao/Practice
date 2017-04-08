import java.util.HashMap;

/**
 * Created by ARPITHA RAO on 25-02-2016.
 */
public class Factorial {

    private static int factorial1(int n){

        if(n==0) return 0;
        if(n==1) return 1;
        return n*factorial(n-1);

    }

   private static int factorial2(int n){
        int num = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        if(n<1) return 1;
        for(int i = 0; i< n+1; i++) {
            if (map.containsKey(i-1))
                num = i * map.get(i - 1);
            map.put(i, num);
        }
        return num;
    }

   static int F[] = new int[7];
    private static int factorial(int n){

        if(n == 0)
            return 1;
        else if(n == 1)
            return 1;
        else if(F[n] != 0) // already calculated case
            return F[n];
        else
            return F[n] = n * factorial(n - 1);
    }
    public static void main(String args[]){

        System.out.println(factorial(6));
        System.out.println(factorial1(6));
        System.out.println(factorial2(6));
    }
}
