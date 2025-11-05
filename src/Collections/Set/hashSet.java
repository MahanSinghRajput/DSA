package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(45);
        set.add(45);
        set.add(90);
        System.out.println(set);
        System.out.println(set.contains(23));

    }
}
