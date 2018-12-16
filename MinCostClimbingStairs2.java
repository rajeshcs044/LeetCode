package com.rajesh.practice.easy;

public class MinCostClimbingStairs2
{
    public static int minCostClimbingStairs(int[] cost)
    {
        int result = 0;
        for (int i = 0; i < cost.length - 3; i++)
        {
            if (cost[i] >= cost[i + 1])
            {
                result = result + cost[i + 1];
                i = i + 1;
            }
            else
            {
                result = result + cost[i];
            }
        }
        if (cost[cost.length - 1] + cost[cost.length - 3] > cost[cost.length - 2])
        {
            result = result + cost[cost.length - 2];
        }
        else
        {
            result = result + cost[cost.length - 1] + cost[cost.length - 3];
        }

        int result1 = 0;
        for (int i = 0; i < cost.length - 1; i++)
        {
            if (cost[i] >= cost[i + 1])
            {
                result1 = result1 + cost[i + 1];
                i = i + 1;
            }
            else
            {
                result1 = result1 + cost[i];
            }
        }
        return result < result1 ? result : result1;
    }

    public static void main(String[] args)
    {
        int[] A = { 10, 15, 20 };
        int[] B = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
        int[] C = { 0, 2, 2, 1 };
        int[] D = { 1, 1, 1, 0 };
        int[] E = { 1, 2, 2, 0 };
        System.out.println("Result: " + minCostClimbingStairs(E));
    }
}
