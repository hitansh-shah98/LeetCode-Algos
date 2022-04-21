class MyHashSet {
    private final int buckets = 10000;
    List<Integer>[] parentList;
    
    public MyHashSet() {
      parentList = new ArrayList[buckets];
      for (int i=0;i<buckets;i++){
          parentList[i] = new ArrayList<Integer>();
      } 
      
        
    }
    
    public void add(int key) {
       int index = key % buckets;
       List<Integer> childList; 
       childList = parentList[index];
       
       
       
           
           if(!childList.contains(key))
           {
            
             childList.add(key);
          
           }
       
       
        
    }
    
    public void remove(int key) {
       int index = key % buckets;
        List<Integer> childList = parentList[index]; 
       if(childList!=null){
          childList.remove(Integer.valueOf(key));
       }
    }
    
    public boolean contains(int key) {
        int index = key % buckets;
        List<Integer> childList = parentList[index];
      
      
        return (childList!=null && childList.contains(key));
    }
    
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */