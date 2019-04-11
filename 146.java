class LRUCache {

    HashMap<Integer,Integer> hm = new HashMap<>();
    LinkedList<Integer> list = new LinkedList<>();
    int capacity=0;
    
    public LRUCache(int capacity) {
        this.capacity=capacity;
    }
    
    public int get(int key) {
        //System.out.println("get "+key);
          int v=0;
        if(hm.containsKey(key)){
                      
            v=hm.get(key);
            update(key);
        }
        else {
            v=-1;
             System.out.println(hm);
        }
        
        return v;
        
            
    }
    
    public void put(int key, int value) {
        //System.out.println("put "+key+" "+value);
        if(hm.containsKey(key)){
            hm.remove(key);
            hm.put(key,value);
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
        System.out.println(hm);
    }
    
    public void update(int key){
        if(hm.size()>capacity){
         hm.remove(list.getLast());
             list.removeLast(); 
        }
              
        else {
           
            list.remove(Integer.valueOf(key));
           
            list.addFirst(key);
        }
        System.out.println(hm);
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */