package CodingChallenges;

/**
 * Created by ARPITHA RAO on 27-03-2017.
 */

public class LongestIncreasingSubarray {
/*
 *
 Array of random integers. Find the length of longest incremental sub array.

 Example : [10, 8, -1, 6, 7, 9] Output 4
 [100, 99] Output 1.
 */

        public static void main(String[] args) {

            //test 1
            int[] input1 = {10, 8, -1, 6, 7, 9};
            System.out.println(longestSubArray(input1));

            //test2
            int[] input2 = {100, 99};
            System.out.println(longestSubArray(input2));

            //test3
            int[] input3 = {};
            System.out.println(longestSubArray(input3));

            //test4
            int[] input4 = {10, 200, 1000};
            System.out.println(longestSubArray(input4));

            //test5
            int[] input5 = {-1, -1};
            System.out.println(longestSubArray(input5));

            //test6
            int[] input6 = {1,2,3,-1,1,2,3,-1};
            System.out.println(longestSubArray(input6));

        }

        public static long longestSubArray(int[] input){
            if(input.length == 0 || input.length == 1) return 0;
            int i = 0;
            long count = 1;
            long max = 0;
            for(i = 1; i < input.length; i++){
                if(max < count) {
                    max=count;
                }
                if(input[i-1] >= input[i]) {
                    count = 1;
                    continue;
                }

                else if(input[i-1]<input[i]){
                    count++;
                }

            }
            if(max < count) {
                max=count;
            }
            return max;

        }
}