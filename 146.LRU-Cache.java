class LRUCache {
    
    Node head = new Node();
    Node tail = new Node();
    HashMap<Integer,Node> mp ;
    int size;
   
    public LRUCache(int capacity) {
        mp = new  HashMap<Integer,Node>(capacity);
        size=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        Node node =mp.get(key);
        if(node!=null){
            remove(node);
            add(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        Node node =mp.get(key);
        if(node!=null){
            remove(node);
            node.value = value;
            add(node);
        }
        else {
            if(mp.size()== size){
            mp.remove(tail.prev.key);
            remove(tail.prev);
            }
            Node newNode = new Node(key,value);
            mp.put(key,newNode);
            add(newNode);
        }
    }
     public void remove(Node n){
        n.next.prev = n.prev;
        n.prev.next = n.next;
        n.next=null;
        n.prev=null;
    }
    public void add(Node node){
        Node headnext = head.next;
        head.next =  node;
        node.prev=head;
        node.next = headnext;
        headnext.prev=node;
        
    }

    private class Node{
        int key, value;
        Node prev, next;
        Node(int k, int v){
            this.key = k;
            this.value = v;
        }
        Node(){
            this(0, 0);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 
 */