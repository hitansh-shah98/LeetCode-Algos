class FrontMiddleBackQueue {
    ListNode head;
    ListNode tail;
    ListNode mid;
    int size;
    public FrontMiddleBackQueue() {
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next=tail;
        tail.prev=head;
    }
    
    public void pushFront(int val) {
        ListNode temp = new ListNode(val);
        temp.next = head.next;
        temp.prev=head;
        head.next.prev=temp;
        head.next=temp;
        size++;
        if(size==1)
            mid = temp;
        else{
            if(size%2==0){
                mid=mid.prev;
            }
        }
        
    }
    
    public void pushMiddle(int val) {
        ListNode temp= new ListNode(val);
        ListNode newMid=temp;
        if(size==0){
            mid = temp;
            mid.next = head.next;
            mid.prev=tail.prev;
            head.next=mid;
            tail.prev=mid;
           
        }
        else if (size%2==0){
            newMid.next = mid.next;
            newMid.prev = mid;
            mid.next=newMid;
            newMid.next.prev = newMid;
            mid=newMid;
        }
        else{
            newMid.next = mid;
            newMid.prev = mid.prev;
            mid.prev.next = newMid;
            mid.prev=newMid;
            mid=newMid;
        }
        size++;
    }
    
    public void pushBack(int val) {
        ListNode temp = new ListNode(val);
        temp.next = tail;
        temp.prev=tail.prev;
        tail.prev.next=temp;
        tail.prev=temp;
        size++;
         if(size==1)
            mid = temp;
        else{
            if(size%2!=0){
                mid=mid.next;
            }
        }
    }
    
    public int popFront() {
        if(size==0)
            return -1;
        int pop = head.next.val;
        //System.out.println("PopFront value: " +pop);
        ListNode tmp = head.next;
        tmp.next.prev = tmp.prev;
        tmp.prev.next = tmp.next;
        size--;
        if(size%2!=0)
            mid=mid.next;
        return pop;
    }
    
    public int popMiddle() {
     
        if(size==0)
            return -1;
            
           int pop = mid.val; 
         // System.out.println("PopMid value: " +pop);
        mid.next.prev = mid.prev;
        mid.prev.next = mid.next;
        size--;
        if(size%2==0)
            mid=mid.prev;
        else
            mid=mid.next;
        return pop;
    }
    
    public int popBack() {
        if(size==0)
            return -1;
        
        int pop = tail.prev.val;
                  //System.out.println("PopBack value: " +pop);
          ListNode tmp =tail.prev;
        tmp.prev.next =tmp.next;
       tmp.next.prev=tmp.prev;
        size--;
         if(size%2==0)
            mid=mid.prev;
        return pop;
    }
    
    static class ListNode {
            int val;
            ListNode prev;
            ListNode next;

            public ListNode(int val) {
                this.val = val;
            }

        }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */


 //Using LinkedList

 class FrontMiddleBackQueue {
    LinkedList<Integer> list;
    
    public FrontMiddleBackQueue() {
        list = new LinkedList();
    }
    
    public void pushFront(int val) {
        list.add(0, val);
    }
    
    public void pushMiddle(int val) {
        list.add(list.size() / 2, val);
    }
    
    public void pushBack(int val) {
        list.add(val);
    }
    
    public int popFront() {
        if(isEmpty()) return -1;
       
        return list.remove(0);
    }
    
    public int popMiddle() {
        if(isEmpty()) return -1;
        
        return list.remove(findMiddleIndex());
    }
    
    public int popBack() {
        if(isEmpty()) return -1;
        
        return list.remove(list.size() - 1);
    }
    
    private boolean isEmpty(){
        return list.isEmpty();
    }
    
    private int findMiddleIndex(){
        return (list.size() - 1) / 2;
    }
    

}