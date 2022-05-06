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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode root = list1;
        ListNode tmp=root;
        int j=0;
       for(int i=1;i<a;i++){
            root=root.next;
           //System.out.println("Val1: " + root.val);
            j=i;
        }
     
            tmp = root;
            root=root.next;
            tmp.next = list2;
        
        while(tmp.next!=null)
        {
              //System.out.println("Val2: " + tmp.val);
            tmp=tmp.next;
        }
        //System.out.println("J: " + j);
        for(int i=j;i<b;i++){
             //System.out.println("Val3: " + root.val);
            root=root.next;
        }
        
        tmp.next = root;
     
        return list1;
    }
}