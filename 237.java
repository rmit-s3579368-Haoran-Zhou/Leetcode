/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node.next==null)
            return;
        else{
        node.val=node.next.val;
        node=node.next.next;
        
        }
        

        
    }
    
}