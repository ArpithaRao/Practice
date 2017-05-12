package leetcode;

/**
 * Created by ARPITHA RAO on 08-05-2017.
 */
public class BuySellStock {

    //cooldown period, make max Profit
    public int maxProfit(int[] price){
        int activeProfit = 0, passiveProfit = 0;

        for(int i = 1; i < price.length; i++){
            int temp = activeProfit;
            activeProfit = Math.max((activeProfit + price[i] - price[i-1]), passiveProfit);
            passiveProfit = Math.max(temp, passiveProfit);
        }

        return Math.max(activeProfit, passiveProfit);
    }

    public static void main(String args[]){
        int[] price = {1, 2, 3, 0, 2};

        BuySellStock bss = new BuySellStock();
        int profit = bss.maxProfit(price);
        System.out.println(profit);
    }
}
