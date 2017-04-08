/**
 * Created by ARPITHA RAO on 30-03-2016.
 */

import java.util.*;

/** Generate random integers in a certain range. */
public final class RandomRange {
    private static ArrayList<Integer> randomSet;
    private static ArrayList<Integer> randomSet1;
    private static ArrayList<Integer> randomSet2;
    @SuppressWarnings("unchecked")
    public static final void main(String... aArgs){
        System.out.println("Generating random integers in the range 1..1000.");
        randomSet = new ArrayList<Integer>();
        randomSet1 = new ArrayList<Integer>();
        randomSet2 = new ArrayList<Integer>();
        int START = 1;
        int END = 50;
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int idx = 1; idx <= 10; ++idx){
            randomSet=showRandomInteger(START, END, random,list);
        }
        for (int idx = 1; idx <= 10; ++idx){
            randomSet1=showRandomInteger(START, END, random,list1);
        }
        for (int idx = 1; idx <= 10; ++idx){
            randomSet2=showRandomInteger(START, END, random,list2);
        }
        System.out.println();
        System.out.println("Random set 1-->");

        log(randomSet);
        System.out.println();

        System.out.println("Random set 2-->");
        log(randomSet1);
        System.out.println();

        System.out.println("Random set 3-->");
        log(randomSet2);

        Set<Integer> set = new HashSet<Integer>();
        set.addAll(randomSet);
        set.addAll(randomSet1);
        set.addAll(randomSet2);
        ArrayList<Integer> merged = new ArrayList<Integer>(set);
        System.out.println();
        System.out.println("Merged Array");
        log(merged);
        Comparator cmp = Collections.reverseOrder();
        Collections.sort(merged,cmp);
        System.out.println();
        System.out.println("Reversed List");
        log(merged);




        ArrayList normal = new ArrayList(merged);
        ArrayList final_o= new ArrayList();
        final_o = make5Tofive(normal);
        System.out.println();

        printlist(final_o);
        System.out.println();
        System.out.println();

        //System.out.println("Final converted String: " + ConvertBack(final_o));


    }



    private static ArrayList make5Tofive(ArrayList paramArrayListInt) {
        // TODO Auto-generated method stub

        for(Object obj: paramArrayListInt){
            if(obj instanceof Integer){
                int i = paramArrayListInt.indexOf(obj);
                if((int)paramArrayListInt.get(i)%10==0){

                    paramArrayListInt.set(i, "grapefruit");
                }
                else if((int)paramArrayListInt.get(i)%2==0){
                    paramArrayListInt.set(i, "two");
                }else if((int)paramArrayListInt.get(i)%5==0){
                    paramArrayListInt.set(i, "five");

                }

            }else {
                continue;
            }
        }
        return paramArrayListInt;
    }

/*


    private static List<String> ConvertBack(ArrayList normal) {
        List<StringBuilder> string = new ArrayList<>();
        for (Object object : normal) {
            string.add(object != null ? object.toString() : null);
        }
        for (int i = 0; i < string.size(); i++) {
            if (string.get(i) == "Grapefruit") {
                (string.get(i)).replaceAll("Grapefruit", "2");
            }
            else if (string.get(i).indexOf("2") != -1) {
                (string.get(i)).replace("2", "Grapefruit");
            }

        }
        return string;
    }
*/





    private static void printlist(ArrayList normal) {
        // TODO Auto-generated method stub
        System.out.println();
        System.out.println("String Conversion");
        for(Object objVal:normal){
            System.out.print(objVal.toString()+" ");
        }
    }



    private static ArrayList<Integer> showRandomInteger(int aStart, int aEnd, Random aRandom, ArrayList<Integer> set){
        if (aStart > aEnd) {
            throw new IllegalArgumentException("Start cannot exceed End.");
        }else{
            //get the range, casting to long to avoid overflow problems
            long range = (long)aEnd - (long)aStart + 1;
            // compute a fraction of the range, 0 <= frac < range
            long fraction = (long)(range * aRandom.nextDouble());
            int randomNumber =  (int)(fraction + aStart);
            set.add(randomNumber);
        }

        return set;
    }


    private static void log(ArrayList<Integer> sets){
        //System.out.println(aMessage);
        for(int i:sets){
            System.out.print(" "+i);
        }
    }
}
