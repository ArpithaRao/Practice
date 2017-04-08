import java.util.HashMap;
import java.util.Map;

/**
 * Created by ARPITHA RAO on 06-03-2016.
 */
public class MajorityElement {

    public static int MajorityElement(int[] array){
        int count =0;
        int Majority = 0;
        for(int i = 0; i< array.length; i++) {
            if(count == 0) Majority = array[i];

            if(Majority == array[i]){
                count++;
            }
            else if(Majority != array[i]){
                count--;
            }
        }
        return Majority;
    }

    public static int FindSingleInt(int[] array){
        int sum = 0;
        for(int i=0; i< array.length; i++){
            sum ^= array[i];
        }
        return sum;
    }

    public static int minDist(int[] array){
        int x = 1, y =5, i = 0;
        int prev_index = 0;
        int min_dist = Integer.MAX_VALUE;
        for(i=0; i<array.length; i++) {
            if (array[i] == x || array[i] == y) {
                prev_index = i;
                break;
            }
        }
            for (; i < array.length; i++) {
                if (array[i] == x || array[i] == y) {
                    if (array[i] != array[prev_index] && (i - prev_index) < min_dist) {
                        min_dist = i - prev_index;
                        prev_index = i;
                    } else
                        prev_index = i;
                }
            }

        return min_dist;
    }

    public static void findCommonElements(int[] array1, int[] array2){
        Map<Integer,Integer> map = new HashMap<>();
        int counter = 0;
        Integer common = null;
        for(int i = 0; i<array1.length; i++){
           if(map.containsKey(array1[i])){
               counter++;
               map.put(array1[i],counter);
           }
            else{
               map.put(array1[i],1);
           }
        }
        for(int i = 0; i< array2.length; i++){
            if(map.containsKey(array2[i])){

                System.out.println(array2[i]+" "+map.get(array2[i]));
            }
        }
    }

    public static void main(String args[]){
        int[] array = {1,1,3,5};
        int[] array1 = {1,1,1,1,2,3,4,5,6,7,8,9};
        System.out.println(MajorityElement(array));
        System.out.println(FindSingleInt(array));
        System.out.println(minDist(array));
        findCommonElements(array,array1 );

    }
}
