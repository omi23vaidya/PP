/*
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
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
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null)
            return null;
        
        while(head.val == val)
        {
            if(head.next == null)
                return null;
            else 
                head = head.next;
            
        }
        
        
        if(head.next == null && head.val == val)
            return null;
        
        if(head.next == null && head.val != val)
            return head;
        
        ListNode temp = head;
        while(temp.next != null)
        {
            if(temp.next.next != null && temp.next.val == val)
            {
                temp.next = temp.next.next;
                continue;
            }
            else if(temp.next.next == null && temp.next.val == val)
            {
                temp.next = null;
                break;
            }
            temp = temp.next;
        }
        
        return head;
        
    }
}