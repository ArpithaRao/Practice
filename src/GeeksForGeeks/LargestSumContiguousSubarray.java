package GeeksForGeeks;

/**
 * Created by ARPITHA RAO on 12-03-2017.
 */
public class LargestSumContiguousSubarray {

    public static int findLargestSum(int[] array){

        int maxSum = 0;

        for(int i = 0; i < array.length - 1;i++){

            int sum = 0;
            int j = i;

            while (j<array.length-1) {
                sum += array[j];
                j++;
            }

            if(sum < maxSum) continue;
            if(maxSum < sum) maxSum = sum;
        }
        return maxSum;
    }

    public static void main(String args[]){
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(findLargestSum(array));
    }

}
