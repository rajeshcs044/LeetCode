package com.rajesh.practice.easy.newpack;

public class BestTimeToBuyAndSellStockII
{
    public int maxProfit(int[] prices)
    {
        if (prices == null || prices.length == 0 || prices.length == 1)
        {
            return 0;
        }

        int i = 1;
        int min = 0;
        int profit = 0;

        while (i < prices.length)
        {
            boolean flag = false;
            while (i < prices.length && prices[i] <= prices[i - 1])
            {
                i++;
            }
            min = prices[i - 1];

            while (i < prices.length && prices[i] >= prices[i - 1])
            {
                flag = true;
                i++;
            }

            if (flag == true)
            {
                profit = profit + prices[i - 1] - min;
            }
        }
        return profit;
    }
}
