package leetcode;

/**
 * Created by ARPITHA RAO on 14-05-2017.
 */
public class PoorPigs {

    public int findNumOfPigs(int totalMin, int minPerSession, int buckets){

        int pigs = 0;
        int iter = totalMin/minPerSession + 1;
        System.out.println(iter);
        while(Math.pow(iter, pigs)<buckets){
            pigs++;
        }

        return pigs;
    }

    public static void main(String args[]){
        PoorPigs p = new PoorPigs();
        int ans = p.findNumOfPigs(60, 15, 100);
        System.out.println(ans);
    }
}
