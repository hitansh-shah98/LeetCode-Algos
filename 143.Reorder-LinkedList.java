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
    public void reorderList(ListNode head) {
       if(head ==null || head.next==null){
           return;
           
       }
        ListNode slow=head, fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode l2 = reverse(slow);
        ListNode l1=head;
        
        while(l1!=null){
            ListNode a = l1.next, b=l2.next;
            l1.next = l2;
            
            if(a==null)
                break;
            l2.next=a;
            l1=a;
            l2=b;
        }
        
     
    }
    public ListNode reverse(ListNode head) {
        if(head == null)
            return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        
        while(curr!=null){
            curr.next = prev;
            prev= curr;
            curr=next;
            if(next!=null)
                next=next.next;
            
        }
        
        return prev;
    }
}