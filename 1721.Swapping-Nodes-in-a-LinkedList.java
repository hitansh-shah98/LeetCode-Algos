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
    public ListNode swapNodes(ListNode head, int k) {
       
        ListNode left = head;
       
        int cnt = 1;    
        while(left!=null){
            if(cnt==k)
                break;
            left=left.next;
            cnt++;
        }
      // System.out.println("Left: " +left.val);
        ListNode p = left;
        ListNode right = head;
        while(p.next!=null){
            p=p.next;
            right=right.next;
        }
        // System.out.println("Left: " +left.val);
         //System.out.println("Right: " +right.val);
        int tmp = left.val;
        left.val=right.val;
        right.val=tmp;
        return head;
    }
}