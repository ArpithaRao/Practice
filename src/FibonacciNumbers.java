import java.util.HashMap;
import java.util.Map;

/**
 * Created by ARPITHA RAO on 03-02-2016.
 */
public class FibonacciNumbers {

    private Map<Integer, Integer> fibCache = new HashMap<>();

    public int cachedFibN(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "n must not be less than zero");
        }
        fibCache.put(0, 0);
        fibCache.put(1, 1);
        return recursiveCachedFibN(n);
    }

    private int recursiveCachedFibN(int n) {
        if (fibCache.containsKey(n)) {
            return fibCache.get(n);    }
        int value = recursiveCachedFibN(n - 1) + recursiveCachedFibN(n - 2);
        fibCache.put(n, value);
        return value;
    }

    public int fibonacciSeries(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
         return fibonacciSeries(n - 1) +  fibonacciSeries(n-2);
    }

    public static void main(String args[]){

        FibonacciNumbers fn = new FibonacciNumbers();
        System.out.println(fn.cachedFibN(7));

        for(int i=0; i< 7; i++){
            System.out.println(fn.fibonacciSeries(i));
        }
    }
}