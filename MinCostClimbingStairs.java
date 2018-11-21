package com.rajesh.practice;

public class MinCostClimbingStairs
{
    public static int minCostClimbingStairs(int[] cost)
    {
        int len = cost.length;
        if (len == 1)
        {
            return cost[0];
        }

        int[] min = new int[len];

        min[0] = cost[0];
        min[1] = cost[1];

        for (int i = 2; i < len; i++)
        {
            min[i] = Math.min(min[i - 1], min[i - 2]) + cost[i];
        }
        return Math.min(min[len - 1], min[len - 2]);
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
