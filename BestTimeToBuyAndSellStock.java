package com.rajesh.practice;

public class BestTimeToBuyAndSellStock
{
    public static int maxProfit(int[] prices)
    {
        if (prices.length == 0)
        {
            return 0;
        }

        int min = prices[0];
        int result = 0;
        for (int i = 1; i < prices.length; i++)
        {
            if (min > prices[i])
            {
                min = prices[i];
            }

            if (result < prices[i] - min)
            {
                result = prices[i] - min;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] A = { 7, 1, 5, 3, 6, 4 };
        int[] B = { 7, 6, 4, 3, 1 };
        System.out.println("Result: " + maxProfit(B));
    }
}
