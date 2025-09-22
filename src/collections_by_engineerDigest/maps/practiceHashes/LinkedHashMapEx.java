package collections_by_engineerDigest.maps.practiceHashes;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Integer , String> linkedHashMap  = new LinkedHashMap<>(3, 0.7f , true);
        linkedHashMap.put(1 ,"Hey");
        linkedHashMap.put(2 ,"yash");
        linkedHashMap.put(3  ,"Reddy");
        linkedHashMap.put(4 ,"Stefan");
        linkedHashMap.put(5,"Mirai");

        linkedHashMap.get(5);
        linkedHashMap.get(2);
//        System.out.println(linkedHashMap);
        System.out.println("Printing using the Map.Entry<Integer, String>");
       for (Map.Entry<Integer , String> entry :linkedHashMap.entrySet()){
           System.out.println(entry.getKey()+":"+entry.getValue());
       }

    }
}
