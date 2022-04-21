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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode root = null;
        
        ListNode temp = root;
        
        for(int i=0;i<lists.length;i++){
            temp = lists[i];
            
            root = merge(root,temp);
        }
        return root;
    }
    public ListNode merge(ListNode left , ListNode right){
        if(left==null)
            return right;
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while(left!=null && right!=null){
            if(left.val < right.val)
            {
                temp.next = left;
                left=left.next;
                temp=temp.next;
            }
            else{
                temp.next = right;
                right=right.next;
                temp=temp.next;
            }
        }
        temp.next = (left==null)? right : left;
        return head.next;
    }
}