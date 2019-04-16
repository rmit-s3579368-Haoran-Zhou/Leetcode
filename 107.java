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
        
        List<List<Integer>> list = new ArrayList<>();
        int level=getHeight(root);
        visit(root,list,level-1);
        return list;
        
    }
    
    public int getHeight(TreeNode root){
        if(root==null)
            return 0;
        else 
            return Math.max(getHeight(root.left),getHeight(root.right))+1;
            
    }
    
    
    public void visit(TreeNode root,List<List<Integer>> list,int level){
        
        if(root==null)
            return;
        while(list.size()<=level)
        list.add(new ArrayList<Integer>());
        list.get(level).add(root.val);
        
        visit(root.left,list,level-1);
        
        visit(root.right,list,level-1);
        
        
        
    }
    
}