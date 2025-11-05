package Collections.List;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> v2 = new Vector<>(5,3);
        // now size would increase by 3
        System.out.println(v.capacity());
        System.out.println(v2.getClass());
        //in array list size is increased to 1.5 times but here it is increased by 2 times
    }
}
