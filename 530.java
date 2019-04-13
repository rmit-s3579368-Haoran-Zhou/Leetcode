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
    int min=Integer.MAX_VALUE,p=-1;
    public int getMinimumDifference(TreeNode root) {
            visit(root);
        return min;
        }
        
        
    
    
    public void visit(TreeNode root){
        if(root==null) return;
        visit(root.left);
        if(p!=-1) min=Math.min(min,abs(root.val,p));
        p=root.val;
        visit(root.right);
    }
    
    
    public int abs(int a,int b){
       return a>b?  a-b: b-a;
    }
    
    
}