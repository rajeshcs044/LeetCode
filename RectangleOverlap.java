package com.rajesh.practice.easy.newpack;

public class RectangleOverlap
{
    public boolean isRectangleOverlap(int[] rec1, int[] rec2)
    {
        int len1 = rec1.length;
        int len2 = rec2.length;

        if (len1 != 4 || len2 != 4)
        {
            return false;
        }

        if ((rec2[0] >= rec1[2] && rec2[2] >= rec1[2]) || (rec2[1] >= rec1[3] && rec2[3] >= rec1[3])
                || (rec1[0] >= rec2[2] && rec1[2] >= rec2[2]) || (rec1[1] >= rec2[3] && rec1[3] >= rec2[3]))
        {
            return false;
        }
        return true;
    }
}
