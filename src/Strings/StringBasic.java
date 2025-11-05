package Strings;

public class StringBasic {
    public static void main(String[] args) {
        String a = "Mahan";
        String b = "Mahan";
        String c = new String("Mahan"); //it creates the obj outside the string pool in the heap
        //comparison

        // == only checks if the ref values are pointing to the same obj or not
        //System.out.println(a==b);
        //System.out.println(a==c); // it gives false


        // when you only need to check or values use equals()
        System.out.println(a.equals(c));

        System.out.println(a.charAt(0)); //used to traverse for characters
    }
}
