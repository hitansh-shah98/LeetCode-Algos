/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next==null)
            return head;
        ListNode dummy = new ListNode(-1); 
    dummy.next = head;

        ListNode prev=dummy;
         ListNode curr=dummy.next;
        int count=1; 
        while(count<left){
            prev=curr;
            curr=curr.next;
            count++;
        }
       
             
      ListNode tmp = prev;
      while(count<=right){
             ListNode next = curr.next;
           curr.next = prev;
            prev = curr;
            curr = next;
         
          count++;
      }   
        
        
        
     
          tmp.next.next = curr;
        tmp.next = prev;
        return dummy.next;
    }
}