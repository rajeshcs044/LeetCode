package com.rajesh.practice.easy.newpack;

public class MajorityElement
{
    public int majorityElement(int[] nums)
    {
        if (nums.length == 0)
        {
            return -1;
        }

        int maj = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (count == 0)
            {
                count++;
                maj = nums[i];
            }
            else if (maj == nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return maj;
    }
}
