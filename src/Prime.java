/**
 * Created by ARPITHA RAO on 25-02-2016.
 */
public class Prime {

    private static boolean isPrime(int n){
        if(n==0) return false;
        if(n==1) return true;
        for(int i=2; i<Math.sqrt(n);i++){
            if(n%i == 0) {
                return false;

            }
        }
        return true;
    }
    public static void main(String args[]){

        int n = 50;

        System.out.print(isPrime(n));

        //Sieve of Eratosthenes algorithm for finding primes
       /* int i, j;
        boolean isPrime[] = new boolean[n+1];

        for( i = 2; i< n; i++){
            isPrime[i] = true;
        }

        //if i is Prime then mark multiple of i as nonPrimes upto N/i

        for ( i = 2; i*i <= n; i++) {
              if (isPrime[i]) {
                for (j = i; i * j <= n; j++) {
                    isPrime[i * j] = false;
                }
            }
        }

        //count number of Primes
        int count = 0;

        for(i = 2; i < n; i++){
            if(isPrime[i]){
                count++;
                System.out.print(" "+i);
            }
        }
        System.out.print(" Number of Primes: "+count);*/
    }
}
