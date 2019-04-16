/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA,b=headB;
        
        if(headA==null||headB==null)
            return null;
        
        int la = 0;
        int lb = 0;
        while(a!=null){
            a=a.next;
            la++;
        }
         while(b!=null){
            b=b.next;
            lb++;
        }
        a=headA;
        b=headB;
        
        if(la>lb){
             for(int i=0;i<la-lb;i++)
                 a=a.next;
        }else{
            for(int i=0;i<lb-la;i++)
                b=b.next;
        }
    
        
        while(a!=b){
            a=a.next;
            b=b.next;
        }
            
        return a;
        
    }
}