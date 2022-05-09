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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int arr [] = new int []{-1,-1};
        ArrayList<Integer> al = new  ArrayList<Integer>();
       
        int i=1;
      
        while(head.next.next!=null){
          
            if(head.next.val < head.val && head.next.val < head.next.next.val){
                
               al.add(i);
            }
            else if (head.next.val > head.val && head.next.val > head.next.next.val){
          
                 al.add(i);
            }
            i++;
           head=head.next;
            
        }
        if(al.size()<2) return arr;
        
        
        max = Math.max(max,al.get(al.size()-1)-al.get(0));     
        int length=al.size();
        for(i=1;i<length;i++){
            min = Math.min(min, al.get(i)-al.get(i-1));
        }       
        arr[0] =min;        
        arr[1] =max;  
        
      
        return arr;
    }
   
}
