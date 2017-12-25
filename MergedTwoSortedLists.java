/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode ans = new ListNode(Integer.MAX_VALUE);
        ListNode ansHead = ans;
        ListNode temp;
        
        while(l1 != null && l2 != null)
        {
            if(l1.val >= l2.val)
            {
                temp = new ListNode(l2.val);
                ans.next = temp;
                ans = ans.next;
                l2 = l2.next;
            }
            else
            {
                temp = new ListNode(l1.val);
                ans.next = temp;               
                ans = ans.next;
                l1 = l1.next;
            }
        }
        
        if(l1 == null)
        {
            while(l2 != null)
            {
                temp = new ListNode(l2.val);
                ans.next = temp;
                ans = ans.next;
                l2 = l2.next;
            }
        }
        else
        {
             while(l1 != null)
            {
                temp = new ListNode(l1.val);
                ans.next = temp;
                ans = ans.next;
                l1 = l1.next;
            }
        }
        
        return ansHead.next;
    }
}