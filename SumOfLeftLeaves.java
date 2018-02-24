/*
Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24

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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        if(root == null)
            return 0;
        
        int sum = 0;
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            
            if(temp.left!=null)
            {
                stack.push(temp.left);
                if(temp.left.left == null && temp.left.right == null)
                    sum = sum + temp.left.val;
            }
            
            
            if(temp.right!=null)
                stack.push(temp.right);
        }
        
        return sum;
        
        /* FASTER BUT USING RECURSION
         
         if(root == null){
            return 0;
        }
        int sum = 0;
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.val;
        }
        return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        
        
        
        */
    }
}