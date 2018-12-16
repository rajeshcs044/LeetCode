package com.rajesh.practice.easy.newpack;

public class MergeSortedArray
{
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int k = m + n;
        k--;
        n--;
        m--;
        while (k >= 0)
        {
            if (n == -1)
            {
                return;
            }
            if (m == -1)
            {
                while (k >= 0)
                {
                    nums1[k] = nums2[n];
                    n--;
                    k--;
                }
                return;
            }
            if (nums1[m] > nums2[n])
            {
                nums1[k] = nums1[m];
                k--;
                m--;
            }
            else
            {
                nums1[k] = nums2[n];
                k--;
                n--;
            }
        }
    }
}
