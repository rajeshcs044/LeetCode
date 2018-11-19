package com.rajesh.practice;

public class ReverseLinkedList
{
    public static ListNode reverseList(ListNode head)
    {
        if(head == null)
        {
            return null;
        }

        ListNode next = null;
        ListNode current = head;
        ListNode prev = null;
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}

class ListNode
{
    int val;
    ListNode next;

    ListNode(int x)
    {
        val = x;
    }
}