package com.rajesh.practice.easy.newpack;

public class LemonadeChange
{
    public boolean lemonadeChange(int[] bills)
    {
        int fiveBills = 0;
        int tenBills = 0;

        for (int i : bills)
        {
            if (i == 5)
            {
                fiveBills++;
            }
            else if (i == 10)
            {
                fiveBills--;
                tenBills++;
            }
            else if (tenBills > 0)
            {
                tenBills--;
                fiveBills--;
            }
            else
            {
                fiveBills = fiveBills - 3;
            }

            if (fiveBills < 0)
            {
                return false;
            }
        }
        return true;
    }
}
