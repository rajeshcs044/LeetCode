package com.rajesh.practice;

public class MergeTwoSortedLists
{
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        ListNode l3 = null;
        ListNode temp = null;
        while (l1 != null && l2 != null)
        {
            if (l1.val < l2.val)
            {
                if (l3 == null)
                {
                    l3 = new ListNode(l1.val);
                    // temp = l1;
                }
                else
                {
                    // temp.next = l1;
                    insertNode(l3, l1.val);
                }
                l1 = l1.next;
            }
            else
            {
                if (l3 == null)
                {
                    l3 = new ListNode(l2.val);
                    // temp = l2;
                }
                else
                {

                    // temp.next = l2;
                    insertNode(l3, l2.val);
                }
                l2 = l2.next;
            }
        }

        while (l1 != null)
        {
            if (l3 == null)
            {
                l3 = insertNode(l3, l1.val);
            }
            else
            {
                insertNode(l3, l1.val);
            }
            l1 = l1.next;
        }

        while (l2 != null)
        {
            if (l3 == null)
            {
                l3 = insertNode(l3, l2.val);
            }
            else
            {
                insertNode(l3, l2.val);
            }
            l2 = l2.next;
        }
        return l3;
    }

    private static ListNode insertNode(ListNode head, int value)
    {
        if (head == null)
        {
            head = new ListNode(value);
            return head;
        }
        ListNode temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = new ListNode(value);
        return head;
    }

    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;

        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;

        ListNode l7 = new ListNode(0);

        ListNode l = mergeTwoLists(null, l7);
        System.out.println(l);
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
