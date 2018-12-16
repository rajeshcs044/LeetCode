package com.rajesh.practice.easy.newpack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < nums2.length; i++)
        {
            while (!st.isEmpty() && st.peek() < nums2[i])
            {
                map.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++)
        {
            res[i] = map.getOrDefault(nums1[i], -1);
        }

        return res;
    }
}
