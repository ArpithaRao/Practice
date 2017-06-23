package leetcode.Amazon.Stocks;

/**
 * Created by ARPITHA RAO on 12-06-2017.
 */
public class BuyAndSellStock {
    // using Kadane's algorithm
    public int findMaxProfit(int[] prices){

        int max = 0, maxSoFar = 0;

        for(int i = 1; i < prices.length; i++){
            max = Math.max(0, max+= prices[i] - prices[i-1]);

            maxSoFar = Math.max(max, maxSoFar);
            System.out.println(max+" "+maxSoFar);
        }
        return maxSoFar;
    }

    public static void main(String args[]){
        BuyAndSellStock bns = new BuyAndSellStock();
        int[] input = {1, 7, 4, 11};
        System.out.println(bns.findMaxProfit(input));
    }

}
