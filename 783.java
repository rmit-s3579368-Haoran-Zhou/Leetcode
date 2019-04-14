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
    int height = Integer.MAX_VALUE;
    Integer p;
    public int minDiffInBST(TreeNode root) {
        p=null;
        visit(root);
        return height;
    }
    
    public void visit(TreeNode root){
       if(root==null) {           
           return;
       }
        visit(root.left);
        if(p!=null)
            height=Math.min(height,root.val-p);
        p=root.val;
        visit(root.right);
    }
    
    
}