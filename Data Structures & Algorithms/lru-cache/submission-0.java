class ListNode {
    int key;
    int value;
    ListNode next;
    ListNode prev;

    public ListNode (int key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

class LRUCache {
    int capacity;
    Map<Integer, ListNode> map;
    ListNode head = new ListNode(0, 0);
    ListNode tail = new ListNode(0, 0);

    public LRUCache(int capacity){
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head.next = tail;
        this.tail.prev = head;
    }

    public int get(int key){
        if(this.map.containsKey(key)){
            ListNode node = this.map.get(key);
            
            // Remove node from prev position
            node.prev.next = node.next;
            node.next.prev = node.prev;
            
            this.updateMRU(node);
            return node.value;
        }

        return -1;        
    }

    public void put(int key, int value){

        if(!map.containsKey(key)){
            ListNode node = new ListNode(key, value);
            if(this.capacity == map.size()){

                // We have to evict the LRU value in the cache
                // i.e value pointed by head;
                ListNode lru = this.head.next;
                this.head.next = this.head.next.next;
                lru.next.prev = this.head;
                this.map.remove(lru.key);
            }
            map.put(key, node);
            this.updateMRU(node);
        }
        else{
            ListNode node = this.map.get(key);
            node.value = value;

            // Remove node from prev position
            node.prev.next = node.next;
            node.next.prev = node.prev;

            this.updateMRU(node);
        }
    }

    public void updateMRU(ListNode node){
        ListNode mru = this.tail.prev;
        
        mru.next = node;
        node.prev = mru;
        node.next = this.tail;
        this.tail.prev = node;
    }
}