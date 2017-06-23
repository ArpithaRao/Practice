import java.util.ArrayList;

/**
 * Created by ARPITHA RAO on 25-02-2016.
 */
public class Prime {

    public int countPrimes(int n) {

        //sieve creation for nonprimes
        int count = 0;
        boolean[] notPrime = new boolean[n];
        for(int i = 2; i < n; i++){
            if(notPrime[i]==false) count++;
            for(int j = 2; i*j <n;j++){
                notPrime[i*j] = true;
            }
        }
        return count;

    }

    private static boolean isPrime(int n){
        if(n==0) return false;
        if(n==1) return true;
        for(int i=2; i<n;i++){
            if(n%i == 0) {
                return false;

            }
        }
        return true;
    }
    public static void main(String args[]){

        int n = 50;

        System.out.print(isPrime(n));
        System.out.println();
        System.out.println("Generating primes ");
        System.out.println(generatePrimes());

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

    public static ArrayList<Integer> generatePrimes(){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            if(result.size()>25){
                break;
            }
            if(isPrime(i)){
                result.add(i);
            }
        }
        System.out.println(result.size());
        return result;
    }

   /* public static boolean checkIfAnagram(String s1, String s2, ArrayList primes){

        HashMap<Character, Integer> charMap = new HashMap<>();
        HashSet<Character> alphabets = new HashSet<>();

        for(int i = 0; i < primes.size(); i++){
            charMap.put()
        }

    }*/

}
