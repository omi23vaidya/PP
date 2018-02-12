/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
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
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        
        int leftHt = maxDepth(root.left) + 1;
        int rightHt = maxDepth(root.right) + 1;
        
        if(leftHt > rightHt)
            return leftHt;
        else
            return rightHt;
    }
}