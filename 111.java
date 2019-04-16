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
        
        
        
        if(root==null)
            return 0;
        
        int l=minDepth(root.left)+1;
        
        int r=minDepth(root.right)+1;
  //最底层叶子结点，在没有叶子时返回最大深度（有叶子的结点）       
        if(l==1&&r!=1||r==1&&l!=1)
            return Math.max(l,r);
        
     //非叶子结点 返回最小的   
        return Math.min(l,r);
        
        
    }
}