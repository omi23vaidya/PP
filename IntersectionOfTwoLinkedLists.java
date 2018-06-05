/*
Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0;
        int countB = 0;
        ListNode currA = headA;
        ListNode currB = headB;
        
        while(currA!=null){
            countA++;
            currA = currA.next;
        }
        
        while(currB!=null){
            countB++;
            currB = currB.next;
        }
        
        int diff = Math.abs(countA-countB);
        if(countA > countB)
            return mergeNode(diff, headA, headB);
        else
            return mergeNode(diff, headB, headA);
        
    }
    
    public ListNode mergeNode(int diff, ListNode headA, ListNode headB){
        ListNode curA = headA;
        ListNode curB = headB;
        
        for(int i=1; i<=diff; i++){
            if(curA == null)
                return null;
            curA = curA.next;
        }
        
        while(curA!=null && curB!=null){
            if(curA == curB){
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }
}