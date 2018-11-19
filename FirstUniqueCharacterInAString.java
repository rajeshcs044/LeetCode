package com.rajesh.practice;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString
{
    public static int firstUniqChar(String s)
    {
        Map<Character, Integer> charLength = new HashMap<Character, Integer>();
        char[] str = s.toCharArray();
        for(int i = 0; i< str.length; i++)
        {
            if(charLength.containsKey(str[i]))
            {
                charLength.put(str[i], charLength.get(str[i])+1);
            }
            else
            {
                charLength.put(str[i], 1);
            }
        }
        for(int i = 0; i< str.length; i++)
        {
            if(charLength.get(str[i]) == 1)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        System.out.println("Result is: " + firstUniqChar("loveleetcode")); //$NON-NLS-1$
    }
}
