/**
 * Created by ARPITHA RAO on 04-02-2016.
 */
import java.util.Arrays;
import java.util.Random;

public class AmazonSumtoX {

    public static final int NUM_OF_ELEMENTS = 50_000;

    public static boolean findSumSort(int[] a, int x) {
        Arrays.sort(a); // timesort after java8
        for (int i = 0, k = a.length - 1; i < k;) {
            int tmp = a[i] + a[k];
            if (tmp == x)
                return true;
            else if (tmp < x)
                i++;
            else
                k--;
        }
        return false;
    }


    public static boolean findSumBruteForce(int[]a, int x) {
        for (int i=0; i< (a.length-1); i++) {
            for (int k=i+1; k < a.length; k++) {
                if((a[i] + a[k]) == x)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] ar = new int[NUM_OF_ELEMENTS];
        int x = 210;
        Random r = new Random();
        for (int i =0; i < NUM_OF_ELEMENTS; i++)
            ar[i] = r.nextInt(100);

        System.out.println("Array SIZE: " + NUM_OF_ELEMENTS);

        long startTime = System.nanoTime();
        long start = System.currentTimeMillis();
        boolean ris = findSumBruteForce(ar, x);
        long endTime = System.nanoTime();
        long end = System.currentTimeMillis();
        System.out.println("Time is millisec"+(end- start));
        System.out.println("Brute Force: " + ris + " - Time: " + ((endTime-startTime)/1000000.0));

        startTime = System.nanoTime();
        ris = findSumSort(ar, x);
        endTime = System.nanoTime();
        System.out.println("Sort and Search: " + ris + " - Time: " + ((endTime-startTime)/1000000.0));
    }
}