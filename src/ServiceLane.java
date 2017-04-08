/**
 * Created by ARPITHA RAO on 30-01-2016.
 */
import java.util.Scanner;

public class ServiceLane {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for (int width_i = 0; width_i < n; width_i++) {
            width[width_i] = in.nextInt();
        }

        for (int a0 = 0; a0 < t; a0++) {
          int  i = in.nextInt();
          int  j = in.nextInt();
            System.out.print(ServiceLane(width,i,j));

        }
        in.close();

    }

    public static int ServiceLane(int[] array, int startIndex, int endIndex)
    {
        int min = Integer.MAX_VALUE;
        for(int i = startIndex;i<=endIndex;i++)
        {
            if(array[i]<min)
                min = array[i];
        }
        return min;
    }

}

