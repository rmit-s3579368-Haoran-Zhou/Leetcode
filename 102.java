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
    

        List<List<Integer>> list2 = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {

        visit(root,list2,0);
        
        
        return list2;
    }
    
    public void visit(TreeNode root,List<List<Integer>> list2,int level){
        
        if(root==null)
            return;
        
        if(list2.size()<=level){
            list2.add(new ArrayList<Integer>());
        } 
        list2.get(level).add(root.val);
        
        visit(root.left,list2,level+1);
        
        visit(root.right,list2,level+1);
        
        
        
        
    }
    
    
    
}