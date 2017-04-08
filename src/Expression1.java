import java.util.ArrayList;
import java.util.List;

/**
 * Created by ARPITHA RAO on 18-01-2016.
 */

public class Expression1 {

    double arr[] = {1, 2, 3, 4, 5, 6};
    double sum[];
    double x=3;
    int i=0;
    double result[];

    public Expression1(){
        result = new double[arr.length];

        for( i=0; i< arr.length; i++) {
            result[i] = Math.pow(x,arr[i]);
            sum = new double[arr.length];
            sum[i] += arr[i] * result[i];
            System.out.println(sum[i]);
        }

         List<UnitExp> exps= new ArrayList<UnitExp>();

    }



  public static void main(String args[]){
      long startTime = System.currentTimeMillis();
       Expression1 exp = new Expression1();


      long stopTime = System.currentTimeMillis();
      long elapsedTime = stopTime - startTime;
      System.out.println("Runtime in Millisec "+elapsedTime);

    }




}
