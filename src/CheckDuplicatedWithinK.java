import java.util.HashSet;

/**
 * Created by ARPITHA RAO on 21-02-2016.
 */

//This is a linear time solution rather than running two for loops of o(nk) complexity
public class CheckDuplicatedWithinK {

    private static boolean CheckForDuplicates(int[] array, int k){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<array.length; i++){
            if(set.contains(array[i])) return true;

            set.add(array[i]);

            if(i>=k) {
                set.remove(array[i-k]);
            }
        }
        return false;

    }

    public static void main(String args[]){
        int [] array = {1, 2, 3, 1, 2, 3, 4, 5, 6};
        System.out.print(CheckForDuplicates(array, 4));
    }
}
