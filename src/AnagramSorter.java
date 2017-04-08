/*
import java.util.Arrays;
import java.util.Comparator;

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ARPITHA RAO on 16-02-2016.
 *//*

public class AnagramSorter implements Comparator<String> {

    public String sortChars(String S1){
        char[] ch = S1.toCharArray();
        Arrays.sort(ch);

        return new String(ch);
    }
    @Override
    public int compare(String S1, String S2) {

        return S1.compareTo(sortChars(S2));
    }

    public static void main(String args[]){
        String[] array = {"abc","def","edf","bac","cba","klmno","acb"};
        Arrays.sort(array, new AnagramSorter());
        for(int i =0; i< array.length; i++)
        System.out.print(array[i]+" ");
    }
}
*/

public class AnagramSorter{
    static String sortChars(String S){
        char[] ch = S.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    static void sort(String array[]) {
        HashMap<String, List<String>> mapList = new HashMap<>();
        ArrayList<String> newArray = new ArrayList<>();


    for (String s: array) {
        String key = sortChars(s);
        if (!mapList.containsKey(key)) {
            mapList.put(key, new ArrayList<>());
        }
        mapList.get(key).add(s);
    }
    /*    List<String> temp = new ArrayList<>();
        temp.add(s);
        mapList.put(key,temp );
    }

        int index =0;
        for (String key: mapList.keySet()){
            ArrayList<String> list = (ArrayList<String>) mapList.get(key);
            for (String t : list){
                newArray.add(t);
            }
        }
        return newArray;*/

    }

    public static void main(String args[]){
        String[] array = {"abc","def","edf","bac","cba","klmno","acb"};
        sort(array);
        for(int i =0; i< array.length; i++)
            System.out.print(array[i]+" ");

    }
}