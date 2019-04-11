class LRUCache {

    HashMap<Integer,Integer> hm = new HashMap<>();
    LinkedList<Integer> list = new LinkedList<>();
    int capacity=0;
    
    public LRUCache(int capacity) {
        this.capacity=capacity;
    }
    
    public int get(int key) {
          int v=0;
        if(hm.containsKey(key)){
                      
            v=hm.get(key);
            update(key);
        }
        else 
            v=-1;
        
        return v;
        
            
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            update(key);            
            
        }else{            
            hm.put(key,value);
            updateNewkey(key);
        }         
    }
    
    public void updateNewkey(int key){
        if(hm.size()>capacity){
         hm.remove(list.getLast());
             list.removeLast(); 
        }
             
        else {
            list.addFirst(key);
        }
        
    }
    
    public void update(int key){
        if(hm.size()>capacity){
         hm.remove(list.getLast());
             list.removeLast(); 
        }
              
        else {
            list.remove(hm.get(Integer.valueOf(key)));
            list.addFirst(key);
        }
           
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */