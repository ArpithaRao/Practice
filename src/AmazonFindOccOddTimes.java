/**
 * Created by ARPITHA RAO on 04-02-2016.
 */
import java.util.Arrays;

public class AmazonFindOccOddTimes {

    public static int findElementOddTimesBetter(int[] i){
        Arrays.sort(i);
        int x, y;
        for( x=0, y=1; y<=(i.length-1); x+=2, y+=2) {
            if (!(i[x] == i[y])) {
                return i[x];
            }
        }

        if (x==(i.length-1))
            return i[x];

        return -1;
    }

    public static void main(String[] args) {

        int[] input  = {1, 2, 1, 4, 5, 3, 1, 3, 5, 4, 1, 5, 3, 2, 4, 5, 3};

        // In this case the element we are looking for is not present
        int[] input2 = {1, 2, 1, 4, 5, 3, 1, 3, 5, 4, 1, 5, 3, 2, 4, 4, 3, 5};

        // In this case the element we are looking for is the last one after the array is sorted
        int[] input3 = {1, 2, 1, 4, 5, 3, 1, 3, 5, 4, 1, 5, 3, 2, 4, 4, 3};

        int x =  findElementOddTimesBetter(input);
        System.out.println("Result: " + x);

        System.out.println("------");

        x =  findElementOddTimesBetter(input2);
        System.out.println("Result: " + x);

        System.out.println("------");

        x =  findElementOddTimesBetter(input3);
        System.out.println("Result: " + x);
    }
}
