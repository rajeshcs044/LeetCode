package com.rajesh.practice.easy.newpack;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays
{
    public int[] intersection(int[] nums1, int[] nums2)
    {
        Set<Integer> nums1Set = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++)
        {
            nums1Set.add(nums1[i]);
        }

        Set<Integer> res = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i++)
        {
            if (nums1Set.contains(nums2[i]))
            {
                res.add(nums2[i]);
            }
        }

        int[] result = new int[res.size()];
        int k = -1;
        for (int val : res)
        {
            k = k + 1;
            result[k] = val;

        }
        return result;
    }
}
