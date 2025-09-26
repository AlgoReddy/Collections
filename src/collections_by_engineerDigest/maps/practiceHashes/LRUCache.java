package collections_by_engineerDigest.maps.practiceHashes;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<k ,v>  extends LinkedHashMap <k,v>{
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.7f, true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<Integer , String> map = new LRUCache(3);
        map.put(1 , "bob");
        map.put(2 ,"ramDev");
        System.out.println(map);
       map.put(3,"haleemBaba");
       map.put(4,"lokaNayakudu");
        System.out.println(map);
        map.get(2);
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue()     );
        }
        System.out.println(map);
    }
}
