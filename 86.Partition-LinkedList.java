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
    public ListNode partition(ListNode head, int x) {
            ListNode part1 = new ListNode(0);
         ListNode part2 = new ListNode(0);
       
        ListNode curr1=part1;
        ListNode curr2=part2;
        while(head!=null){
          
            if(head.val < x){
                curr1.next = head;
                curr1=head;
               
            }
            else{
                 curr2.next = head;
                curr2=head;
            }
            head=head.next;
           
        }
        curr2.next=null;
        curr1.next=part2.next;
        
        
        return part1.next;
    }
    
}


//other soln:
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
    public ListNode partition(ListNode head, int x) {
            ListNode part = new ListNode(0);
        ListNode curr=head;
        ListNode tmp=part;
        ListNode prev=null;
        while(curr!=null){
           //System.out.println("List1: "+ curr.val);
            if(curr.val < x){
                 ListNode tmp2 = new ListNode(curr.val);
                tmp.next = tmp2;
                tmp=tmp.next;
            }
            curr=curr.next;
           
        }
        curr=head;
        while(curr!=null){
            //System.out.println("List2: "+ curr.val);
            if(curr.val >= x){
                ListNode tmp2 = new ListNode(curr.val);
                tmp.next = tmp2;
                tmp=tmp.next;
            }
            curr=curr.next;
           
        }
        
        return part.next;
    }
    
}