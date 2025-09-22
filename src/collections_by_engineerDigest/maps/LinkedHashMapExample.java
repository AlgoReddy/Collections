package collections_by_engineerDigest.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11,0.3f,true);
        linkedHashMap.put("orange", 10);
        linkedHashMap.put("apple", 90);
        
        linkedHashMap.put("custard-apple", 18);
        linkedHashMap.put("guava", 9);
        linkedHashMap.get("orange");
        linkedHashMap.get("apple");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue());
        }
    }

}
