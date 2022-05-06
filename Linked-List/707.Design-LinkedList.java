class MyLinkedList {
    class ListNode {
     int val;
     ListNode next;
    
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    ListNode head;
    
    int size;
    public MyLinkedList() {
        head = null;
      
        size=0;
    }
    
    public int get(int index) {
     
        if(index <0  || index >= size)
           return -1;
      
     else{
         ListNode curr = head;
      for(int i=0;i<index;i++){
          curr=curr.next;
          
      }
     
        return curr.val;
     }
    }
    
    public void addAtHead(int val) {
        
        
        ListNode tmp = new ListNode(val);
        tmp.next = head;
        head=tmp;
        size++;
     
        
    }
   
    
    public void addAtTail(int val) {
     
        if(size == 0){
            addAtHead( val);
            return;
        }
           ListNode tmp = new ListNode(val);
         ListNode curr = head;
   
        while(curr.next!=null){
            curr=curr.next;
        }
        
       curr.next=tmp;
       
        tmp.next=null;
        size++;
       
    }
    
    public void addAtIndex(int index, int val) {
         ListNode tmp = new ListNode(val);
         ListNode curr = head;
        if(index == size){
              addAtTail(val);
            return;
        }
          if(index == 0){
            addAtHead(val);
            return;
        }
          if(index > size) {
            return;
        }
       
        int count=0;
        while(count != (index-1))
        {
            curr=curr.next;
            count++;
          
        }
         tmp.next = curr.next;
        curr.next = tmp;
        
        size++;
       
        
    }
    
    public void deleteAtIndex(int index) {
     
         if(index < 0 || index >=size) {
            return;
        }
         ListNode curr = head;
        if(index == 0)
            head=curr.next;
        else{
           int count=0;
         curr = head;
        ListNode prev = null;
        while(count != (index))
        {
             prev=curr;
            curr=curr.next;
            count++;
          
        }           
            
        prev.next=curr.next;
        }
        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */