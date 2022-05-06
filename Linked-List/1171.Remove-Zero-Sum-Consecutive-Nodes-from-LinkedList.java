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
    public ListNode removeZeroSumSublists(ListNode head) {
       
       
        HashMap<Integer,ListNode> mp = new    HashMap<Integer,ListNode>();
        ListNode root = new ListNode(0);
         root.next = head;
        mp.put(0,root);
        int sum=0;
       int K=0; 
      while(head!=null){
          sum+=head.val;
          if(!mp.containsKey(sum)){
              mp.put(sum,head);
          }
          if (mp.containsKey(sum - K)){
              ListNode prev = mp.get(sum-K);
              ListNode start=prev;
                   // traverse till current node
                int aux = sum;
 
                // Update sum
                sum = sum - K;
              while(prev!=head){
                  prev=prev.next;
                   aux += prev.val;
                    if (prev != head) {
                        mp.remove(aux);
                    }
              }
              start.next=head.next;
          }
          head = head.next;
      }
        return root.next;
    }
}