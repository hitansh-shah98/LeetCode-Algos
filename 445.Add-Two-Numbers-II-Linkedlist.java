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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rev1 = reverseList (l1);
        ListNode rev2 = reverseList(l2);
        
        ListNode c1 = rev1;
        ListNode c2 = rev2;
        ListNode fin = new ListNode(0);
        ListNode s = fin;
        int carry=0;
        while(c1!=null || c2!=null || carry>0){
            if(c1!=null) {
                carry+=c1.val;
                c1=c1.next;
            }
            if(c2!=null){
                carry+=c2.val;
                   c2=c2.next;
            }
         
              ListNode temp = new ListNode(carry%10);
            carry = carry/10;
          
            s.next=temp;
            s=temp;
            
         
            
        }        
        return reverseList(fin.next);
    }
     public ListNode reverseList(ListNode head) {
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