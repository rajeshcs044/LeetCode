package com.rajesh.practice.easy.newpack;

public class RomanToInteger
{
    public int romanToInt(String s)
    {
        if (s == null || s.isEmpty())
        {
            return 0;
        }

        int result = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i] == 'I')
            {
                if (i + 1 < ch.length && ch[i + 1] == 'V')
                {
                    result = result + 4;
                    i++;
                }
                else if (i + 1 < ch.length && ch[i + 1] == 'X')
                {
                    result = result + 9;
                    i++;
                }
                else
                {
                    result = result + 1;
                }
            }
            else if (ch[i] == 'V')
            {
                result = result + 5;
            }
            else if (ch[i] == 'X')
            {
                if (i + 1 < ch.length && ch[i + 1] == 'L')
                {
                    result = result + 40;
                    i++;
                }
                else if (i + 1 < ch.length && ch[i + 1] == 'C')
                {
                    result = result + 90;
                    i++;
                }
                else
                {
                    result = result + 10;
                }
            }
            else if (ch[i] == 'L')
            {
                result = result + 50;
            }
            else if (ch[i] == 'C')
            {
                if (i + 1 < ch.length && ch[i + 1] == 'D')
                {
                    result = result + 400;
                    i++;
                }
                else if (i + 1 < ch.length && ch[i + 1] == 'M')
                {
                    result = result + 900;
                    i++;
                }
                else
                {
                    result = result + 100;
                }
            }
            else if (ch[i] == 'D')
            {
                result = result + 500;
            }
            else if (ch[i] == 'M')
            {
                result = result + 1000;
            }
            else
            {
                System.out.println("Wrong input");
                break;
            }
        }

        return result;
    }
}
