/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
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
    public ListNode deleteDuplicates(ListNode head) {
       
        
        if(head == null)
            return null;
        
        if(head.next == null)
            return head;
        
        ListNode headStored = head;
        ListNode fast = head.next;
        
        while(fast != null)
        {
            if(head.val == fast.val)
            {
                head.next = fast.next;
                fast = fast.next;
                continue;
            }
            head = head.next;
            fast = fast.next;
        }
        
        return headStored;
        
    }
}