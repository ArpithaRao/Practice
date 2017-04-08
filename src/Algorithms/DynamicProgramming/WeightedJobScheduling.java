package Algorithms.DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by ARPITHA RAO on 31-03-2017.
 */
public class WeightedJobScheduling {

    static class Job{

        int start = 0, end = 0, profit;
        Job(int start, int end, int profit){

            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }

    static class FinishTimeComparator implements Comparator<Job> {

        @Override
        public int compare(Job arg0, Job arg1) {
            if(arg0.end <= arg1.end){
                return -1;
            }else{
                return 1;
            }
        }

    }

    public static int findMaxJobsCost(Job[] array){

        int T[] = new int[array.length];

        FinishTimeComparator comparator = new FinishTimeComparator();
        Arrays.sort(array, comparator);

        for(int i = 0; i < array.length; i++){
            T[i] = array[i].profit;
        }

        for(int  i = 1; i <array.length; i++){
            for(int j = i-1; j >=0; j--){
                if(noOverlap(array[j],array[i])) {
                    T[i] = Math.max(T[j] + T[i], T[i]);
                    break;
                }
            }
        }

        int max = 0;
        for(int i = 0; i < array.length; i++){
//            System.out.print(T[i]+" ");
            max = Math.max(max, T[i]);
        }

        return max;

    }

    public static boolean noOverlap(Job job1, Job job2){
        if(job1.end > job2.start){
            return false;
        }
        return true;
    }

    public static void main(String args[]){
        Job[] array = new Job[6];

        array[0] = new Job(1,3,5);
        array[1] = new Job(2,5,6);
        array[2] = new Job(4,6,5);
        array[3] = new Job(6,7,4);
        array[4] = new Job(5,8,11);
        array[5] = new Job(7,9,2);
        System.out.println("Maximum cost of all jobs: "+findMaxJobsCost(array));


    }

}
