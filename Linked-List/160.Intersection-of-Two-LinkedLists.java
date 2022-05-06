/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         HashSet<ListNode> hs = new  HashSet<ListNode>();
//         ListNode currA =headA;
        
//         while(currA!=null){
//             hs.add(currA);
//             currA=currA.next;
//         }
//         ListNode currB=headB;
//         while(currB!=null){
//             if(hs.contains(currB))
//                 return currB;
//             currB=currB.next;
//         }
//         return null;
          if(headA == null || headB == null) return null;
         ListNode currA =headA;
          ListNode currB=headB;
        
        while(currA!=currB){
            currA = (currA==null) ? headB:currA.next;
             currB = (currB==null) ? headA:currB.next;
        }
        return currA;
    }
}