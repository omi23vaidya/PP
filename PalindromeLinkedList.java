/*
Given a singly linked list, determine if it is a palindrome.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null)
            return true;
        
        ListNode fast = head;
        ListNode slow = head;
    
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //for odd linkedlist length 
        if(fast!=null)
        {
            slow = slow.next;
        }
        
        
        ListNode curr = slow;
        ListNode prev = null;
        ListNode next;
        while(slow!=null)
        {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        ListNode newHead = prev;
        fast = head;
        while(fast!=null && newHead!=null)
        {
            if(fast.val!=newHead.val)
                return false;
            fast=fast.next;
            newHead = newHead.next;
        }
        return true;
    }
    
}