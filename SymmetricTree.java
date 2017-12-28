/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
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

//Recursive Approach

class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null)
            return true;
        else
            return isSymmetric(root.left, root.right);
    }
    
    public boolean isSymmetric(TreeNode left, TreeNode right)
    {
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        
        if(left.val == right.val)
            return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        else
            return false;
    }
}

//***************************OR******************************
//Iterative Approach

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
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null)
            return true;
        else
        {
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.push(root.left);
            stack.push(root.right);
            while(!stack.isEmpty())
            {
                TreeNode n1 = stack.pop();
                TreeNode n2 = stack.pop();
                if(n1 == null && n2 == null)
                    continue;
                if(n1 == null || n2 == null || n1.val!=n2.val)
                    return false;
                
                stack.push(n1.left);
                stack.push(n2.right);
                stack.push(n1.right);
                stack.push(n2.left);
                
            }
        
        }
        return true;
    }
}
