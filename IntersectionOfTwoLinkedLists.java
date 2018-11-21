package com.rajesh.practice;

public class IntersectionOfTwoLinkedLists
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        int count1 = 0;
        ListNode temp1 = headA;
        while (temp1 != null && temp1.next != null)
        {
            temp1 = temp1.next;
            count1++;
        }

        int count2 = 0;
        ListNode temp2 = headB;
        while (temp2 != null && temp2.next != null)
        {
            temp2 = temp2.next;
            count2++;
        }

        if (temp1 != temp2)
        {
            return null;
        }
        if (count1 > count2)
        {
            for (int i = 0; i < count1 - count2; i++)
            {
                headA = headA.next;
            }
        }
        else
        {
            for (int i = 0; i < count2 - count1; i++)
            {
                headB = headB.next;
            }
        }
        while (headA != null && headB != null)
        {
            if (headA == headB)
            {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
