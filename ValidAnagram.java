package com.rajesh.practice;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram
{
    public static boolean isAnagram(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }

        Map<Character, Integer> charLength = new HashMap<Character, Integer>();
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++)
        {
            if (charLength.containsKey(str[i]))
            {
                charLength.put(str[i], charLength.get(str[i]) + 1);
            }
            else
            {
                charLength.put(str[i], 1);
            }
        }

        Map<Character, Integer> charLength1 = new HashMap<Character, Integer>();
        char[] tChar = t.toCharArray();
        for (int i = 0; i < tChar.length; i++)
        {
            if (charLength1.containsKey(tChar[i]))
            {
                charLength1.put(tChar[i], charLength1.get(tChar[i]) + 1);
            }
            else
            {
                charLength1.put(tChar[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charLength.entrySet())
        {
            if (entry.getValue() != charLength1.get(entry.getKey()))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(isAnagram("anagram", "nagram"));
    }
}
