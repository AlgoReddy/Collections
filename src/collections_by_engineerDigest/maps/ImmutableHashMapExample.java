package collections_by_engineerDigest.maps;

import java.util.*;

public class ImmutableHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Monday", 1);
        map.put("tuesday", 2);
        Map<String, Integer> map1 = Collections.unmodifiableMap(map);
        // map1.put("wednesday",3);
        Map<String, Integer> map2 = Map.of("wednesday", 3, "thurdsday", 4);
        Map.ofEntries(Map.entry("thurdsday", 5), Map.entry("friday", 6));

    }
}
