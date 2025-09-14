package collections_by_engineerDigest.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IntroHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "yash");
        map.put(2, "chinna");
        map.put(3, "suguna");
        System.out.println(map.get(3));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("yash"));
        // Set<Integer> keys = map.keySet();
        // for (Integer key : keys) {
        // System.out.println(map.get(key));
        // }
        for (int i : map.keySet()) {
            System.out.println(map.get(i));

        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.print(entry.getKey() + " :" + entry.getValue() + " ");

        }
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.print(entry.getValue().toUpperCase() + " ");

        }
        System.out.println(map);
        // System.out.println(map.remove(2));
        System.out.println(map.remove(1, "chinna"));
        //if you enter any invalid (name or key values pairs should be same if not it wont remove any value)
        System.out.println(map);

    }

}
