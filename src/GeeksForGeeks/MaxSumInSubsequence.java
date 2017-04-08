package GeeksForGeeks;

/**
 * Created by ARPITHA RAO on 12-03-2017.
 */
public class MaxSumInSubsequence {

    public static int findMaxSum(int[] array){

        int maxSum = Integer.MIN_VALUE;
        int length = array.length-1;
        for(int i = 0; i <= length; i++){
            int j = i;
            int sum = 0;
            while (j <= length){
                sum += array[j];
                j+=2;
            }
            if(sum>maxSum) maxSum = sum;
        }
        return maxSum;
    }

    public static void main(String args[]){
        //test 1
        int array1[] = {5, 5, 10, 100, 10, 5};
        System.out.println(findMaxSum(array1));

        //test 2
        int  array2[] = {1, 2, 3};
        System.out.println(findMaxSum(array2));

        //test 3
        int arr[] = {1, 20, 3};
        System.out.println(findMaxSum(arr));
    }

}
