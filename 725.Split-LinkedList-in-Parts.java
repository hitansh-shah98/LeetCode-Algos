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
 
    public ListNode[] splitListToParts(ListNode head, int k) {
             ListNode[] parts = new ListNode[k];
        ListNode root = head;
        int length=0;
        while(root!=null){
            length++;
            root=root.next;
        }
          int n = length / k, r = length % k; 
        ListNode node = head, prev = null;
        for (int i = 0; node != null && i < k; i++, r--) {
            parts[i] = node;
            for (int j = 0; j < n + (r > 0 ? 1 : 0); j++) {
                prev = node;
                node = node.next;
            }
            prev.next = null;
        }
        return parts;
    }
}