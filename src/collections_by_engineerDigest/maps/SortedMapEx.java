package collections_by_engineerDigest.maps;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapEx {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>((a, b) -> b - a);
        map.put(1, "chinna");
        map.put(2, "ram");
        map.put(3, "lakshman");
        map.put(4, "sai");
        System.out.println(map);
        System.out.println(map.headMap(3));
        System.out.println(map.tailMap(3));
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
        System.out.println(map.lastKey());
    }
}
