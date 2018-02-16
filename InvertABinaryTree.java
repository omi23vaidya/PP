/*
Invert a binary tree.
     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
Trivia:
This problem was inspired by this original tweet by Max Howell:
Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so fuck off.

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
    public TreeNode invertTree(TreeNode root) {
        /*
        //Recursion for DFS
        
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
        
        ---------------OR---------------
        */
        
        //Stack for BFS
        if(root==null)
        {
            return null;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode temp = stack.pop();
            TreeNode left = temp.left;
            temp.left = temp.right;
            temp.right = left;
            
            if(temp.left!=null)
            {
                stack.push(temp.left);
            }
            
            if(temp.right!=null)
            {
                stack.push(temp.right);
            }
        }
        
        return root;
        
    }
}