/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 //includes getting length of loop cycle
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;
        ListNode s = head;
        ListNode f = head;
        
        int length=0;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f)
            {
          //       ListNode temp = s;
          // //      System.out.println("Loop: " +s.val);
          //       do{
          //           temp=temp.next;
          //           length++;
          //       }
          //       while(temp!=s);
                break;
            }
        }
     
        
        if( s== f){
        f=head;
        
        
        // if (length==0)
        //     return null;
        
      
        while(s!=f){
            s=s.next;
           
            f=f.next;
           
        }
        return s;
        }
        return null;
    }
}