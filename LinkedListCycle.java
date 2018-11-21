package com.rajesh.practice;

public class LinkedListCycle
{
    public static boolean hasCycle(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return false;
        }

        ListNode temp = head;

        while (temp != null)
        {
            head = head.next;
            temp = temp.next != null ? temp.next.next : null;
            if (head == temp)
            {
                return true;
            }
        }
        return false;
    }

    private static class ListNode
    {
        int val;
        ListNode next;

        ListNode(int x)
        {
            val = x;
            next = null;
        }
    }
}
