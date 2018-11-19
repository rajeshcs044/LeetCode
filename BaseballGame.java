package com.rajesh.practice;

import java.util.Stack;

public class BaseballGame
{
    public static int calPoints(String[] ops)
    {
        Stack<Integer> st = new Stack();
        for (int i = 0; i < ops.length; i++)
        {
            if (ops[i].equals("C"))
            {
                st.pop();
            }
            else if (ops[i].equals("D"))
            {
                st.push(st.peek() * 2);
            }
            else if (ops[i].equals("+"))
            {
                int last = st.pop();
                int value = st.peek() + last;
                st.push(last);
                st.push(value);
            }
            else
            {
                st.push(Integer.parseInt(ops[i]));
            }
        }

        int count = 0;
        while (!st.isEmpty())
        {
            count = count + st.pop();
        }
        return count;
    }

    public static void main(String[] args)
    {
        String a[] = { "5", "2", "C", "D", "+" };
        System.out.println("Result : " + calPoints(a));
    }
}
