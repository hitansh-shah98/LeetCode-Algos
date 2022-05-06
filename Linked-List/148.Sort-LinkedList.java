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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next==null)
            return head;
      
        
         ListNode slow = head, fast = head;
 
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode nextmiddle = slow.next;
        
        slow.next=null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(nextmiddle);
        
        return merge(left,right);
    }
    public ListNode merge(ListNode left , ListNode right){
        ListNode res = new ListNode(0);
        ListNode temp = res;
        while(left!=null && right!=null){
            if(left.val <= right.val){
                temp.next = left;
                left=left.next;
                temp=temp.next;
            }
            else if(left.val > right.val){
                temp.next = right;
                right=right.next;
                temp=temp.next; 
            }
            
        }
        temp.next = (left == null) ? right:left;
        return res.next;
    }
   
  
}