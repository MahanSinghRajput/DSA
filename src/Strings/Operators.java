package Strings;
import java.util.ArrayList;
public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //gives 195 adds ASCII value
        System.out.println("a" + "b"); //gives ab, Concatenate the strings
        System.out.println((char)('a'+3)); //gives d
        System.out.println("a" + 1);//gives a1, this is equal to "a" + "1"
        // int will be converted to Integer that will call toString()

        System.out.println("abc" + new ArrayList<>()); // abc[]
        System.out.println("abc" + 56); //abc56
        // System.out.println(new ArrayList<>() + 56); //gives error
        // '+' only works for primitives or at least one should be a string
        System.out.println(new ArrayList<>() + "" + 56); //it works
    }
}
