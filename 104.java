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
        int l=1,r=1;
        
        if(root==null)
            return 0;
        
        l=maxDepth(root.left)+1;
        
        r=maxDepth(root.right)+1;
        
        return max(l,r);
        
        
    }
    
    public int max(int a,int b){
        return a>b? a:b;
        
    }
    
}