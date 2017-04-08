package Algorithms.DynamicProgramming;

/**
 * Created by ARPITHA RAO on 04-04-2017.
 */
public class MinJumpToReachEnd {

    public static String minJump(int[] array){

        int[] minJumps = new int[array.length];
        int[] T = new int[array.length];
        T[0] = 0;
        int[] actualJumpPositions = new int[array.length];

        for(int i = 1; i < T.length; i++){
            T[i] = Integer.MAX_VALUE;
        }

        for(int i = 1; i < array.length; i++){
            for(int j = 0; j<i; j++){
                if(array[j]+j >= i){
                    if(T[i]>T[j]+1) {
                        T[i] = T[j] + 1;
                        actualJumpPositions[i] = j;
                    }
                    }
                }
            }
        StringBuilder s = new StringBuilder();
        for(int i = actualJumpPositions.length-1; i >=0; ){

            minJumps[i] = i;
            s.append(i);
            s.append(",");
            s.append(" ");
            int reminder = i-actualJumpPositions[i];
            i=i-reminder;

        }

        s.append("out");

        /*for(int k = 0; k < minJumps.length; k++){
            if(minJumps[k]!=0) {

                System.out.print(minJumps[k] + " ");
                s.append(minJumps[k]);
                s.append(",");
                s.append(" ");
            }
        }*/
        return s.toString();
    }

    public static void main(String args[]) {
        /*int[] array = {2,3,1,1,2,4,2,0,1,1};
        minJump(array);*/

        int[] array2 = {5,6,0,4,2,4,1,0,0,4};
        minJump(array2);

    }

}
