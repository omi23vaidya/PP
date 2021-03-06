/*
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return helper(root)!=(-1);
    }
    
    public int helper(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int left = helper(root.left);
        if(left == -1)
            return -1;
        int right = helper(root.right);
        if(right == -1)
            return -1;
        if(Math.abs(left-right) > 1)
            return -1;
        return Math.max(left, right)+1;
        
    }
}