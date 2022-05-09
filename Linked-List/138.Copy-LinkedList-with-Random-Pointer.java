/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
// current soln time O(N) , space O(1)
class Solution {
    public Node copyRandomList(Node head) {
      if(head ==null )
          return head;
        Node curr=head;
    while(curr!=null)
    {
        Node tmp = curr.next;
        curr.next = new Node(curr.val);
        curr.next.next = tmp;
        curr=tmp;
    }
        curr=head;
    while(curr!=null){
        if(curr.next!=null){
            curr.next.random = curr.random != null ? curr.random.next : null;
        }
        curr=curr.next.next;
    }
    Node orig = head;
    Node copy = head.next;
    Node tmp = copy;
        while(orig!=null){
            orig.next=orig.next.next;

                copy.next = copy.next==null ? copy.next : copy.next.next;
            orig=orig.next;
            copy=copy.next;
        }
    return tmp;
    }
}
//another soln time O(N) , space O(N)
//      Map<Node, Node> map = new HashMap<Node, Node>();
  
//   // loop 1. copy all the nodes
//   Node node = head;
//   while (node != null) {
//     map.put(node, new Node(node.val));
//     node = node.next;
//   }
  
//   // loop 2. assign next and random pointers
//   node = head;
//   while (node != null) {
//     map.get(node).next = map.get(node.next);
//     map.get(node).random = map.get(node.random);
//     node = node.next;
//   }
  
//   return map.get(head);
