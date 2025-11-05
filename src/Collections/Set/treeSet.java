package Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(23);
        set.add(45);
        set.add(45);
        set.add(90);
        System.out.println(set);
        System.out.println(set.contains(23));
    }
}
