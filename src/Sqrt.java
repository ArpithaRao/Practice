import java.util.Scanner;

/**
 * Created by ARPITHA RAO on 01-02-2016.
 */
public class Sqrt {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sqrt = 0;
         for(int i=0; i<x/2; i++){
             if(i*i== x) sqrt = i;
             else if (i >  Math.sqrt(x)) sqrt = (int)Math.floor(Math.sqrt(x));
             else if (i <  Math.sqrt(x)) sqrt = (int)Math.ceil(Math.sqrt(x));
         }
        System.out.print(sqrt);
    }

}
