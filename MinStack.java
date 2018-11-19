package com.rajesh.practice;

public class MinStack
{
    int size = -1;
    int[] s = new int[10000];
    int[] m = new int[10000];

    /** initialize your data structure here. */
    public MinStack()
    {
        for(int i=0; i< m.length; i++)
        {
            m[i] = Integer.MAX_VALUE;
        }
    }

    public void push(int x)
    {
        size++;
        s[size] = x;
        m[size] = x;
        if(size != 0 && m[size] > m[size-1])
        {
            m[size] = m[size-1];
        }
    }

    public void pop()
    {
        size--;
    }

    public int top()
    {
        return s[size];
    }

    public int getMin()
    {
        return m[size];
    }

    public static void main(String[] args)
    {
        MinStack ms = new MinStack();
        ms.push(-2);
        ms.push(0);
        ms.push(-3);
        System.out.println(ms.getMin());
        ms.pop();
        ms.top();
        System.out.println(ms.getMin());
    }
}
