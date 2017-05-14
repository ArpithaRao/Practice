package leetcode;

/**
 * Created by ARPITHA RAO on 11-05-2017.
 */
public class BuyAndSellStock {
        public int maxProfit(int[] prices) {
            int min = Integer.MAX_VALUE;
            int nextMax = Integer.MIN_VALUE;
            int minPosition = 0;
            for(int i = 0; i < prices.length; i++){
                if(prices[i]<min) {
                    min = prices[i];
                    minPosition = i;
                }
            }

            System.out.println(min+" "+minPosition);

            for(int i = minPosition; i < prices.length; i++){
                System.out.println("max: "+nextMax+" prices[i]: "+prices[i]);
                if(nextMax < prices[i]) {
                    nextMax = prices[i];

                }
            }
            return nextMax - min;
        }

    public static void main(String args[]){
        int[] input = {7,1,5,3,6,4};
        BuyAndSellStock buyAndSellStock = new BuyAndSellStock();
        System.out.println(buyAndSellStock.maxProfit(input));

    }

    }

