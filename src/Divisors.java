import java.util.ArrayList;
import java.util.List;

/**
 * Created by ARPITHA RAO on 08-03-2016.
 */
public class Divisors {

    public static void main(String args[]){
        int a = 100;
        int count = 0;
        List<Integer> newArray = new ArrayList<>();
        for(int i = 1; i< (a^(1/2)) + 1; i++){
            if(a%i == 0) {
                newArray.add(i);
                count++;
            }

        }
        if(count%2 == 0) System.out.println("Number of divisors are even");

        else System.out.println("Number of divisors are odd");

        System.out.print("divisors are "+newArray);

    }

}
