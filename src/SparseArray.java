import java.util.Scanner;

/**
 * Created by ARPITHA RAO on 29-01-2016.
 */
public class SparseArray {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        scan.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLine();
        }

        String[] query = new String[q];
        for (int i = 0; i < q; i++) {
            query[i] = scan.nextLine();
        }

        System.out.print(SparseArray(n, q, arr,query));
    }

    public static int SparseArray(int n, int q, String str[], String query[]){
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j< q;j++){
                if(str[i].equals(query[j])) count++;

            }

        }
        return count;

    }
}
