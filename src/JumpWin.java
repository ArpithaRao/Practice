/**
 * Created by ARPITHA RAO on 28-01-2016.
 */

import java.util.Scanner;

public class JumpWin {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int  m, N;
        N = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.print(JumpWin(arr, m));
    }

    public static String JumpWin(int[] arr, int jump) {
        int i = 0;
        int current =0;
        String ret = "yes";

        if(arr.length==0) return "";
        if(current<0) return "NO";

        if(arr[i]!=0) return "NO";
        current = arr[0];

        if (current > arr.length) return ret;
        if (current < arr.length && current > 0) {
            if (arr[i] == 0) {
                JumpWin(arr, jump);
                JumpWin(arr, jump - 1);
                JumpWin(arr, jump + 1);
            }
        }


        return ret;

    }
}


