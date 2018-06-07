/*
Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1 ... n.

Example:

Input: 3
Output:
[
  [1,null,3,2],
  [3,2,null,1],
  [3,1,null,null,2],
  [2,1,3],
  [1,null,2,null,3]
]
Explanation:
The above output corresponds to the 5 unique BST's shown below:

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
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
    public List<TreeNode> generateTrees(int n) {
        if(n<=0)
            return new ArrayList<TreeNode>();
        
        return generateTrees(1, n);
    }
    
    public List<TreeNode> generateTrees(int s, int e){
        
        List<TreeNode> result = new ArrayList<>();
        
        if(s>e){
            result.add(null);
            return result;
        }
        
        List<TreeNode> leftSub;
        List<TreeNode> rightSub;
        for(int r=s; r<=e; r++){
            leftSub = generateTrees(s, r-1);
            rightSub = generateTrees(r+1, e);
        
        
        for(TreeNode leftNode : leftSub)
            for(TreeNode rightNode : rightSub){
                TreeNode root = new TreeNode(r);
                root.left = leftNode;
                root.right = rightNode;
                result.add(root);
            }
        }
        return result;
    }
}