package com.rajesh.practice;

import java.util.Stack;

public class PalindromeLinkedList
{
    public static boolean isPalindrome(ListNode head)
    {
        // Reversing the list fully and comparing is failing because the original list is updated. It cannot be reverted
        // back.

        /*ListNode revList = reverseList(head);
        while (head != null)
        {
            if (head.val != revList.val)
            {
                return false;
            }
            head = head.next;
            revList = revList.next;
        }
        return true;*/


        //Using stack
        Stack<Integer> st = new Stack<Integer>();
        ListNode temp = head;
        while (temp != null)
        {
            st.push(temp.val);
            temp = temp.next;
        }

        while (head != null)
        {
            if (st.pop() != head.val)
            {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    public static ListNode reverseList(ListNode head)
    {
        if (head == null)
        {
            return null;
        }

        ListNode next = null;
        ListNode current = head;
        ListNode prev = null;
        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        System.out.println("Result: " + isPalindrome(l1));
    }
}
