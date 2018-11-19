package com.rajesh.practice;

import java.util.Stack;

public class ValidParentheses
{
    public static boolean isValid(String s)
    {
        if (s.length() % 2 != 0)
        {
            return false;
        }

        Stack<Character> st = new Stack();

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++)
        {
            if (charArray[i] == '(' || charArray[i] == '{' || charArray[i] == '[')
            {
                st.push(charArray[i]);
            }
            else
            {
                if (st.isEmpty())
                {
                    return false;
                }
                char c = st.pop();

                if (c == '(')
                {
                    if (charArray[i] != ')')
                    {
                        return false;
                    }
                }
                else if (c == '{')
                {
                    if (charArray[i] != '}')
                    {
                        return false;
                    }
                }
                else if (c == '[')
                {
                    if (charArray[i] != ']')
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
        }

        return st.isEmpty() ? true : false;
    }

    public static void main(String[] args)
    {
        System.out.println(isValid("){"));
    }
}
