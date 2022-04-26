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
    public ListNode deleteMiddle(ListNode head) {
         if (head == null || head.next == null) {
           
            return null;
        }
        ListNode slow = null;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = (slow==null)? head : slow.next;
            fast = fast.next.next;
        }
        //System.out.println("Middle node: " + slow.val);
        ListNode middle = slow.next;
        slow.next = middle.next;
        middle.next = null;
        return head;
    }
}