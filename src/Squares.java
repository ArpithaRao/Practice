/**
 * Created by ARPITHA RAO on 27-01-2016.
 */
import java.util.Scanner;

public class Squares {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            System.out.println(Squares(n,m));
        }
    }
public static int Squares(int M, int N){
    int count = 0;
    int x=0;
     for(int i=M; i<=N;i++){
         x = (int)Math.sqrt(i);
         if(x*x==i) count++;
     }
    return count;
}
}
//0(1) time complexity