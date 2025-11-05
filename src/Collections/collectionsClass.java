package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class collectionsClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(45);//adds element to the list
        list.add(34);
        list.add(90);
        list.add(82);
        list.add(7);
        list.add(8); //you can give more elements than defined in initialCapacity.
        System.out.println(list);

        System.out.println("MIN: "+ Collections.min(list) + ", MAX: "+ Collections.max(list));
        System.out.println(Collections.frequency(list,34));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
