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


// Doubly Linked lIst:
public static Node reverseDLL(Node  head)
{
   if(head == null)
            return head;
        Node reverse = null;
       
        
        while(head!=null){
            Node temp = head.next;
            head.next = reverse;
            reverse=head;
            reverse.prev=temp;
            head=temp;
            
        }
        
        return reverse;
    
}