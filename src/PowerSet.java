import java.util.ArrayList;

/**
 * Created by ARPITHA RAO on 02-03-2016.
 */
public class PowerSet {

    private static ArrayList<ArrayList<Integer>> getSubset(ArrayList<Integer> set) {
        int max = (int) Math.pow(2, set.size());
        ArrayList<Integer> subset = new ArrayList<>();
        ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<>();
        for (int k = 0; k < max; k++) {
            subset = convertKtoSet(k, set);
            allsubsets.add(subset);
        }
        return allsubsets;
    }

    private static ArrayList<Integer> convertKtoSet(int x, ArrayList<Integer> set){
        ArrayList<Integer> subset = new ArrayList<>();
        int index = 0;
        for(int k = x; k > 0; k >>= 1){
            if((k & 1) == 1) subset.add(set.get(index));
            index++;
        }

        return subset;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
        }};
        System.out.print(getSubset(list));
    }
}