import java.util.Scanner;

/**
 * Created by ARPITHA RAO on 12-02-2016.
 */
public class SimpleSum {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int  a = scan.nextInt();
        int  b = scan.nextInt();
        int  c = scan.nextInt();
        int  d = scan.nextInt();

        System.out.print(isitPossible(a,b,c,d));

    }

    public static String isitPossible(int a, int b, int c, int d){

        if (c % b == 0 && d % a == b) return "YES";

        else if (c % b == a && d % a == 0) return "YES";

        else if (d % a == 0  && c% b == 0 ) return "YES";

        else if (c % b == a  && d % a == b) return "YES";

        else

        return "NO";
    }
}
