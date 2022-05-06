/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null)
            return head;
       
        Node temp = head;
        
       
        while(temp!=null){
             if(temp.child==null){
                 temp=temp.next;
                 continue;
             }
             Node childRow = temp.child;
            while(childRow.next!=null){
                childRow=childRow.next;
            }
            childRow.next = temp.next;
            if(temp.next!=null)
                temp.next.prev=childRow;
            temp.next=temp.child;
            temp.child.prev=temp;
            temp.child=null;
            
            
            
        }
        return head;
    }
  
}