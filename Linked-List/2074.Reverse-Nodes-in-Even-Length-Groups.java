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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode root = head;
        ListNode prev = null;
        
ListNode ptr = head;
        int total = 0;
        while (ptr != null) {
            total++;
            ptr = ptr.next;
        }
         int numOfNodes = 1;
        while(root!=null){
             numOfNodes = Math.min(numOfNodes, total);
            total -= numOfNodes;
            if (numOfNodes % 2 == 1) {
                // Odd: Move pointers.
                int cnt = 0;
                while (root != null && cnt++ < numOfNodes) {
                    prev = root;
                     root=root.next;
                }
            } else {
            prev.next = reverse(root,numOfNodes);
        prev = root;
        root=root.next;
        
            }
             numOfNodes++;
        }
        return head;
      
    }
    public ListNode reverse(ListNode node ,int length) {
        if (node == null) {
            return null;
        }
        ListNode current = node;
        ListNode previous = null;
        
        ListNode next = null;
        while(length>0){
            next= current.next;
            current.next = previous;
            previous = current;
            current=next;
            length--;
            }
        node.next = current;
        return previous;
    }
}