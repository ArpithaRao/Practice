package GeeksForGeeks;

import java.util.ArrayList;

/**
 * Created by ARPITHA RAO on 12-03-2017.
 */
public class LeadersInArray {

    public static ArrayList<Integer> findLeaaders(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int size = arr.length;
        for (int i = 0; i < size; i++)
        {
            int j;
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size){
            result.add(arr[i]);// the loop didn't break
            }
        }
        return result;
    }

    public static void main(String args[]){
        int[] array =  {16, 17, 4, 3, 5, 2};
        System.out.println(findLeaaders(array));
    }

}
