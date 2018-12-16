package com.rajesh.practice.easy;

public class ShortestSubarrayOneLoop
{
    public static int shortestSubarray(int[] A, int K)
    {
        int len = A.length;
        int min = len + 1;

        int start = 0;
        int end = 0;
        int sum = 0;
        int result = -1;
        for (int i = 0; i < len; i++)
        {
            sum = sum + A[i];
            end = end + 1;
            if (sum < 0)
            {
                sum = 0;
                start = i + 1;
                end = i + 1;
            }
            else
            {
                if (sum >= K)
                {
                    result = end - start;
                    if (min > result)
                    {
                        min = result;
                    }
                    if (start == len)
                    {
                        break;
                    }
                    if (result != 1)
                    {
                        sum = sum - A[i];
                        i = i - 1;
                        end = end - 1;
                    }
                    sum = sum - A[start];
                    start = start + 1;
                }
                if (start > 0 && start != len && i == len - 1)
                {
                    sum = sum - A[start] - A[i];
                    start = start + 1;
                    end = end - 1;
                    i = i - 1;
                }
            }
        }
        return min > len ? -1 : min;
    }

    public static void main(String[] args)
    {
        int[] A = { 2, -1, 2 }; // 3
        int[] B = { 1, 2 };
        int[] C = { 17, 85, 93, -45, -21 };
        int[] D = { 84, -37, 32, 40, 95 }; // 167
        int[] E = { 17, 85, 93, -45, -21 }; // 150
        int[] F = { -28, 81, -20, 28, -29 }; // 89
        int[] G = { 18, 83, -43, -18, 60 }; // 18
        int[] H = { -34, 37, 51, 3, -12, -50, 51, 100, -47, 99, 34, 14, -13, 89, 31, -14, -44, 23, -38, 6 }; // 151

        System.out.println("Result: " + shortestSubarray(H, 151));
    }
}
