package com.rajesh.practice;

@SuppressWarnings("javadoc")
public class BinarySearchTree
{
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
        int[] A = { 2, 7, 11, 15 };; //{ 1, 2, 3, 4, 6, 7, 8 };
        System.out.println("Result is: " + binarySearch(A, 7, 1, A.length -1)); //$NON-NLS-1$
    }
}
