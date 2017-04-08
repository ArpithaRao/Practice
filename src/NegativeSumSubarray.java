import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ARPITHA RAO on 28-01-2016.
 */

public class NegativeSumSubarray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(NegativeSumSubarray(N, arr));
    }

    public static int NegativeSumSubarray(int N, int[] array) {
        int count = 0;
        int sum = 0;


        for (int i = 0; i < N; i++) {

            for(int j=i+1; j< N+1;j++) {
               int[] newarray = Arrays.copyOfRange(array, i, j);
                for(int l=0; l< newarray.length;l++){
                    sum += newarray[l];
                }
                if(sum<0) count++;

            }
        }
        return count;
    }
}
