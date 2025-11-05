package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // syntax:
         ArrayList<Integer> list = new ArrayList<>(5);
         list.add(45);//adds element to the list
         list.add(34);
         list.add(90);
         list.add(82);
         list.add(7);
         list.add(8); //you can give more elements than defined in initialCapacity.
        System.out.println(list);

        /*  functions of list
            list.contains(int n); //gives true or false.
            list.set(int index,int newValue); //changes the value at a particular index.
            list.remove(int index); //removes the value at particular index.
            list.get(int index); //prints the value at particular index.
         */

        /*
            input can be taken as:
            for(int i=0;i<5;i++){
                list.add(in.nextInt());
            }

            output can be given as:
            for(int i=0;i<5;i++){
                System.out.print(list.get(i) + " ");
                // pass index here, list[index] will not work here
            }
        */
    }
}
