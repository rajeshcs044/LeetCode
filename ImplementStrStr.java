package com.rajesh.practice.easy.newpack;

public class ImplementStrStr
{
    public int strStr(String haystack, String needle)
    {
        if (needle.isEmpty())
        {
            return 0;
        }

        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();

        for (int i = 0; i < haystack.length(); i++)
        {
            if (h[i] == n[0])
            {
                int j = i + 1;
                while (j < h.length && j - i < n.length && h[j] == n[j - i])
                {
                    j++;
                }
                if (j == n.length + i)
                {
                    return i;
                }
            }
        }

        return -1;
    }
}
