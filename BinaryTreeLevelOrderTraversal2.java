/*
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        
        if(root == null)
            return ans;
        
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            int children = queue.size();
            List<Integer> innerList = new LinkedList<Integer>();
            for(int i = 1; i<=children; i++)
            {
                if(queue.peek().left != null)
                    queue.add(queue.peek().left);
                if(queue.peek().right != null)
                    queue.add(queue.peek().right);
                innerList.add(queue.poll().val);                
            }
            ans.add(0, innerList);
        }
        return ans;
    }
}