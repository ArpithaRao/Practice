/**
 * Created by ARPITHA RAO on 27-01-2016.
 */
import java.util.Scanner;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(FindDigits(n));
        }
    }
       public static int FindDigits(int N){
          int res=0;
           int number = N;
           String numbers = String.valueOf(N);


           for(int i=0;i<numbers.length();i++)
           {
               int digit = Integer.parseInt(Character.toString(numbers.charAt(i)));
               if(digit==1)
                   res++;
               else if(digit>0 && number%digit==0)
                   res++;
           }
           return res;
    }
}