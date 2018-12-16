package com.rajesh.practice.easy.newpack;

public class RemoveDuplicatesFromSortedArray
{
    public int removeDuplicates(int[] nums)
    {
        if (nums.length == 0 || nums.length == 1)
        {
            return nums.length;
        }

        // Simple solution
        int j = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if(nums[i] != nums[i-1])
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

        //little complex
        /*int j = 0;
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
            if (temp != nums[i] && j != i)
            {
                j++;
                int temp1 = nums[i];
                nums[i] = nums[j];
                nums[j] = temp1;
                temp = nums[j];
            }
            else
            {
                temp = nums[i];
            }
        }
        return j + 1;*/
    }
}
