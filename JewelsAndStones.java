package com.rajesh.practice;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones
{
    public static int numJewelsInStones(String J, String S)
    {
        Set<Character> JChar = new HashSet<Character>();
        char[] a = J.toCharArray();
        for (int i = 0; i < J.length(); i++)
        {
            JChar.add(a[i]);
        }

        int count = 0;
        char[] b = S.toCharArray();
        for (int i = 0; i < b.length; i++)
        {
            if (JChar.contains(b[i]))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(numJewelsInStones("z","ZZZ"));
    }
}
