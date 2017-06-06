package CodingChallenges;

/**
 * Created by ARPITHA RAO on 23-05-2017.
 */
public class SumDistance {

    public int findMaxSumDistance(int[] A){
        int[] top = new int[A.length];
        int max = -Integer.MAX_VALUE;
        for (int i=A.length-1; i>=0; i--) {
            if (A[i] > max) max = A[i];
            top[i] = max;
        }

        int best = 0;
        int curMaxIndex = 0;
        for (int i=0; i<A.length; i++) {
            while(curMaxIndex < top.length && top[curMaxIndex] >= A[i])
                curMaxIndex++;
            if((curMaxIndex - 1 - i) > best)
                best = curMaxIndex - 1 - i;
        }

        return best;
    }

    public static void main(String args[]){
        SumDistance sd = new SumDistance();
        int[] A = {1,3,-3};
        int[] B = {-8, 4, 0, 5, -3, 6};
        int res = sd.findMaxSumDistance(B);
        System.out.println(res);
    }

}
