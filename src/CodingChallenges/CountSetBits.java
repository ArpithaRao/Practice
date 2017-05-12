package CodingChallenges;

/**
 * Created by ARPITHA RAO on 08-05-2017.
 */
public class CountSetBits {

    public int findSetBits(int n){
        int count = 0;

        while(n>0){
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String args[]){
        CountSetBits countSetBits = new CountSetBits();
        int res = countSetBits.findSetBits(5);
        System.out.println(res);
    }

}
