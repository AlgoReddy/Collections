package collections_by_engineerDigest.maps.practiceHashes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<Integer , String> map = new HashMap<>();
        map.put(1 , "yash");
        map.put(2 , "sai");
        map.put(3 , "sowmya")   ;
        map.put(4 ,"suguna");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsValue("sowmya"));
        System.out.println("Printing using the map.keyset method");
        System.out.println("I am printing the map using the map.tostring method");
        System.out.println(map);
        for (int i : map.keySet()){
            System.out.println(map.get(i));
        }
        System.out.println("This is using the Map.Entry<Integer , String >> ");
        System.out.println("What we are doing here is getting the values from the map & making them capitals & setting them or again adding themto the map");
        Set<Map.Entry <Integer , String>> entries = map.entrySet();
        for (Map.Entry<Integer, String >  entry: entries){
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);
    }
}
