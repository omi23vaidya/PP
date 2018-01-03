/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
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
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftHt = minDepth(root.left);
        int rightHt = minDepth(root.right);
        
        return ((leftHt == 0 || rightHt == 0) ? leftHt + rightHt + 1 : Math.min(leftHt, rightHt) + 1);
    }
}