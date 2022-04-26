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
    public ListNode mergeNodes(ListNode head) {
        ListNode root = head;
         ListNode temp=null;
        if(head==null)
            return head;
        ListNode curr = root;
        curr=curr.next;
        int sum=0;
        while(true){
            while( curr!=null && curr.val!=0 ){
                sum+=curr.val;
                curr=curr.next;
            }
            //System.out.println("Sum:" + sum);
            if(curr!=null){
            temp = new ListNode(sum);
            root.next = temp;
            temp.next=curr.next;
            root=temp;    
            curr=curr.next;
            sum=0;    
            }
            else{
                break;
            }
        }
        return head.next;
    }
}