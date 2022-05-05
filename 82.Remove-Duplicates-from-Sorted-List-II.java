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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prevHead = new ListNode(0);
        ListNode prev=prevHead;
        prevHead.next =head;
        ListNode curr=head;
        
        while(curr!=null){
           
            while(curr.next!=null && curr.val==curr.next.val){
                curr=curr.next;
            }
            if(prev.next == curr)
                prev=prev.next;
            else
                prev.next=curr.next;
            
            curr=curr.next;
        }
       return prevHead.next;
    }
}


// previous soln using TreeMap
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = new ListNode(0);
        ListNode curr=head;
        TreeMap<Integer,Integer> hs = new TreeMap<Integer,Integer> ();
        while(curr!=null){
            if(hs.containsKey(curr.val)){
                hs.put(curr.val,hs.get(curr.val)+1);
            }
            else{
            hs.put(curr.val,1);
            }
            curr=curr.next;
        }
        curr=prev;
        
          for (Map.Entry<Integer, Integer>
                 entry : hs.entrySet()){
          
            if(entry.getValue() == 1)
            {    
            ListNode temp = new ListNode(entry.getKey());
            curr.next = temp;
            curr=curr.next;
            }
        }
        return prev.next;
    }
}