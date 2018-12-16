package com.rajesh.practice.easy.newpack;

public class RemoveElement
{
    public static int removeElement(int[] nums, int val)
    {
        //simple solution
        if (nums.length == 0)
        {
            return 0;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;


        // little complicated
        /*int count = 0;
        int valIndex = -1;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++)
        {
            if (valIndex == -1 && nums[i] == val)
            {
                valIndex = i;
            }
            if (valIndex != -1 && i > valIndex && nums[i] != val)
            {
                flag = true;
                int temp = nums[i];
                nums[i] = nums[valIndex];
                nums[valIndex] = temp;
                valIndex++;
            }
            else
            {
                if (valIndex != -1)
                {
                    count++;
                }
            }
        }
        return flag == true ? valIndex : nums.length - count;*/
    }

    public static void main(String[] args)
    {
        int A[] = { 1 };
        System.out.println("Result: " + removeElement(A, 2));
    }
}
