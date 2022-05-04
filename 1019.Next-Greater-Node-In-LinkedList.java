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
    public int[] nextLargerNodes(ListNode head) {
       
        ArrayList<Integer> A = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next)
            A.add(node.val);
        int[] res = new int[A.size()];
        Stack<Integer> stack = new Stack<>();
            
        for(int i=A.size()-1;i>=0;i--){
            if(stack.isEmpty()){
                res[i] =0;
            }
            else if(!stack.isEmpty() && stack.peek() > A.get(i)){
                res[i] = stack.peek();
            }
            else if(!stack.isEmpty() && stack.peek() <= A.get(i)){
                while(!stack.isEmpty() && stack.peek() <= A.get(i)){
                  stack.pop();
                }
             
                if(stack.isEmpty())
                    res[i]=0;
                else
                    res[i]=stack.peek();
            }
          
            stack.push(A.get(i));
            
            
        }
        return res;
    }
    
  

}