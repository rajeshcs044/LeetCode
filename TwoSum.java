package com.rajesh.practice;

public class TwoSum
{
    public static int[] twoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++)
        {
            // int secondNumber = binarySearch(nums, target - nums[i], i+1, nums.length - 1); if the array is sorted.
            int second = target - nums[i];
            for (int j = i + 1; j < nums.length; j++)
            {
                if (second == nums[j])
                {
                    int[] A = { i, j };
                    return A;
                }
            }
        }
        int[] A = { -1, -1 };
        return A;
    }

    public static int binarySearch(int[] A, int k, int start, int end)
    {
        while (start <= end)
        {
            int mid = (start + end) / 2;

            if (A[mid] == k)
            {
                return mid;
            }
            else if (A[mid] > k)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] A = { 3, 3 };
        int[] B = twoSum(A, 6);
        System.out.println("Result is: " + B[0] + " - " + B[1]); //$NON-NLS-1$
    }
}
