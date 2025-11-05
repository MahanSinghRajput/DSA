package ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Questions {
    static void reverseList(ArrayList<Integer> list){
        for(int i=0;i<list.size()/2;i++){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(list.size()-i-1));
            list.set(list.size()-i-1,temp);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(10);
        list.add(9);
        System.out.println(list);
        reverseList(list); // or simply use Collections.reverse(list);
        System.out.println(list);
        // to sort the given list
        Collections.sort(list);
        System.out.println(list);
        // to sort in descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
