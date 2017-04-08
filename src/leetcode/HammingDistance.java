package leetcode;

/**
 * Created by ARPITHA RAO on 05-03-2017.
 */
public class HammingDistance {

    public static int hammingDistance(int x, int y) {

        int z = x ^ y;
        System.out.println(z);
        int count = 0;
        while(z > 0){
            if(z%2!=0) count++;
            z  >>= 1;
        }

        return count;

    }

    public static int findComplement(int num){
        int temp = num;
        int mask = 0;
        mask = (Integer.highestOneBit(num) << 1) - 1;
        int complement = num ^ mask;
        return complement;
    }


    public static void main(String args[]){

        /*System.out.println(hammingDistance(1, 4));
        System.out.println("--------------------------");*/
        System.out.println(findComplement(5));
    }

}
