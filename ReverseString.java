package com.rajesh.practice.easy.newpack;

public class ReverseString
{
    public String reverseString(String s)
    {
        if (s == null || s.length() == 0 || s.length() == 1)
        {
            return s;
        }

        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (j > i)
        {
            char temp = ch[j];
            ch[j] = ch[i];
            ch[i] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}
