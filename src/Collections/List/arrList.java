package Collections.List;
import java.util.*;
public class arrList {
    public static void main(String[] args) {
        //default size of arraylist is 10
        //adding removing and iterating takes O(n) time, access by index takes O(1)
        ArrayList<Integer> list = new ArrayList<>(); // List<Integer> list = new ArrayList<>();
        //if you give the size here then the default size is changed internally not the actual size
        /*
          example:
          ArrayList<Integer> list = new ArrayList<>(1000);
          list.size() = 0;
         */
        list.add(12);
        list.add(25);
        list.add(1,23);
        list.set(2,34); //replaces the value at index 2 with the new value
        System.out.println(list.get(1));
        System.out.println(list.size());
        Collections.sort(list);
        /*
        agar list mein se koi value ke according hatana ho index se nhi to use
        list.remove(Integer.valueOf(int val));
         */
//        for(int i : list){
//           // System.out.print(i + " ");
//        }
        System.out.println(list.contains(25));
        System.out.println(list.contains(5));
        //list.remove(1); // give index
        //can also be created as
        List l = Arrays.asList("Mon","Tue"); //bracket mein koi array bhi de skte hain
        System.out.println(l.get(1));
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(0,0);
        List<Integer> l2 = List.of(4,5,6,7,8,9);
        l1.addAll(l2);
        System.out.println(l1);
        Object[] arr = list.toArray();
        list.toArray(new Integer[0]);
        Iterator<Integer> i = list.iterator();
        while(i.hasNext()){
            System.out.println("Iterator: " + i.next());
        }
    }
}
