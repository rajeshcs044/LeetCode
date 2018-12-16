package com.rajesh.practice.easy.newpack;

public class RobotReturnToOrigin
{
    public boolean judgeCircle(String moves)
    {
        if (moves == null || moves.length() == 0)
        {
            return true;
        }

        int countU = 0;
        int countL = 0;
        int countD = 0;
        int countR = 0;
        char[] ch = moves.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i] == 'U')
            {
                countU = countU + 1;
            }
            else if (ch[i] == 'D')
            {
                countD = countD + 1;
            }
            else if (ch[i] == 'L')
            {
                countL = countL + 1;
            }
            else if (ch[i] == 'R')
            {
                countR = countR + 1;
            }
            else
            {
                return false;
            }
        }

        if (((countU == 0 && countD == 0) || (countU > 0 && countD > 0))
                && ((countL == 0 && countR == 0) || (countL > 0 && countR > 0)) && countU == countD && countL == countR)
        {
            return true;
        }

        return false;
    }
}
