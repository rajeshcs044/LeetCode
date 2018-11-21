package com.rajesh.practice;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII
{
    public static List<Integer> getRow(int rowIndex)
    {
        if (rowIndex == 0)
        {
            List<Integer> result = new ArrayList<Integer>();
            result.add(1);
            return result;
        }

        if (rowIndex == 1)
        {
            List<Integer> result = new ArrayList<Integer>();
            result.add(1);
            result.add(1);
            return result;
        }

        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(1);
        for (int i = 2; i <= rowIndex; i++)
        {
            List<Integer> newResult = new ArrayList<Integer>();
            newResult.add(1);
            for (int j = 0; j < result.size() - 1; j++)
            {
                newResult.add(result.get(j) + result.get(j + 1));
            }
            newResult.add(1);
            result = newResult;
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println("Result: "+ getRow(7));
    }
}
