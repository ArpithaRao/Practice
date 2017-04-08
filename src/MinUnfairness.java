import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ARPITHA RAO on 30-01-2016.
 */
public class MinUnfairness {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int k = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< N; i++){
            list.add(scan.nextInt());
        }
        Collections.sort(list);

        int unfairness = 0;

          unfairness =  list.get(k-1) - list.get(0);
        System.out.print(unfairness);

        }


    }

