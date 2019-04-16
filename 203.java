/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {


        ListNode headhead = new ListNode(-1);
        headhead.next=head;
        ListNode cur=headhead;

        
        while(headhead.next!=null)
        {
            if(headhead.next.val==val)
            {
                headhead.next=headhead.next.next;
                
            }
            else
            headhead=headhead.next;
            
           
        }
        
        return cur.next;
    }
}