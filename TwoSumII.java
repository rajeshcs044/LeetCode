package com.rajesh.practice;

public class TwoSumII
{
    public static int[] twoSum(int[] numbers, int target)
    {
        for (int i = 0; i < numbers.length; i++)
        {
            int secondNumber = binarySearch(numbers, target - numbers[i], i + 1, numbers.length - 1);

            if (secondNumber != -1)
            {
                int[] A = { i + 1, secondNumber + 1 };
                return A;
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
