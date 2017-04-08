package GeeksForGeeks;

/**
 * Created by ARPITHA RAO on 12-03-2017.
 */
public class GCD {

    public static int findGCD(int a, int b){

        if(b==0) return a;
        return findGCD(b, a%b);

    }

    public static void main(String args[]){
        System.out.println(findGCD(26,4));
    }

}
