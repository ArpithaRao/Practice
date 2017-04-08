package GeeksForGeeks;

import java.util.*;

/**
 * Created by ARPITHA RAO on 12-03-2017.
 */
public class SortByFrequency {

    public static void getSortedArray(int[] array){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else
                map.put(array[i],1);
        }

        List<Integer> mapValues = new ArrayList<>(map.values());
        Collections.sort(mapValues);

       LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        Iterator<Integer> value = mapValues.iterator();
        while (value.hasNext()){
            int val = value.next();

            Iterator<Integer> key = map.keySet().iterator();

            while (key.hasNext()){
                Integer k = key.next();

                if(val == map.get(k)){
                    key.remove();
                    sortedMap.put(k,val);
                    break;
                }
            }
        }
        System.out.println(sortedMap.keySet());
    }

    public static void main(String args[]){
        int arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
        getSortedArray(arr);
    }

}
