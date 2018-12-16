package com.rajesh.practice.easy.newpack;

public class MoveZeroes
{
    public void moveZeroes(int[] nums)
    {
        if (nums.length == 0 || nums.length == 1)
        {
            return;
        }

        int zp = -1;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0)
            {
                zp = i;
                break;
            }
        }

        if (zp == -1)
        {
            return;
        }

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0 && zp < i)
            {
                int temp = nums[zp];
                nums[zp] = nums[i];
                nums[i] = temp;
                zp++;
            }
        }
    }
}
