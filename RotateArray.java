package com.rajesh.practice;

public class RotateArray
{
    public static void rotate(int[] nums, int k)
    {
        if (nums.length == 0)
        {
            return;
        }
        while (k > 0)
        {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--)
            {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            k--;
        }
    }

    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3, 4, 5 };
        rotate(A, 3);
        System.out.println("Result: " + A);
    }
}
