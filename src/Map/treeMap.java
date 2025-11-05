package Map;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        Map<String, Integer> mpp = new TreeMap<>(Comparator.reverseOrder());
        mpp.put("One", 1);
        mpp.put("Two", 2);
        mpp.put("Three", 3);
        mpp.put("Four", 4);
        mpp.put("Five", 5);
        System.out.println(mpp);
        mpp.remove("Five");
        mpp.putIfAbsent("Two", 22);
        System.out.println(mpp.get("One"));

        // System.out.println(mpp.containsKey("Three"));
        //System.out.println(mpp.containsValue(3));
//        for(Map.Entry<String,Integer> e: mpp.entrySet()){
//            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        for(String key: mpp.keySet()){
//            System.out.println(key);
//        }
//
//        for(int value: mpp.values()){
//            System.out.println(value);
//        }

        mpp.clear();
        System.out.println(mpp.isEmpty());
    }
}
