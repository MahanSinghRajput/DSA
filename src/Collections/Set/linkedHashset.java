package Collections.Set;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashset {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(23);
        set.add(45);
        set.add(45);
        set.add(90);
        System.out.println(set);
        System.out.println(set.contains(23));
    }
}
