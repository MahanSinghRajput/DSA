package HashMaps;

import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("mahan",18);
        System.out.println(map.get("mahan"));
        System.out.println(map.getOrDefault("abc",89));
        System.out.println(map.containsKey("mahan"));
        System.out.println(map.containsKey("abc"));

        HashSet<Integer> set = new HashSet<>();
        set.add(68);
        set.add(78);
        set.add(93);
        set.add(99);
        set.add(68);
        System.out.println(set);

        TreeMap<String, Integer> map2 = new TreeMap<>();
        map2.put("mahan",18);
        System.out.println(map2.get("mahan"));
        System.out.println(map2.getOrDefault("abc",89));
        System.out.println(map2.containsKey("mahan"));
        System.out.println(map2.containsKey("abc"));
    }
}
