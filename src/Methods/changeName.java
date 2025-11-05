package Methods;

import java.util.Scanner;

public class changeName {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String name=a.next();
        change(name);
        System.out.println(name);
        System.out.println(change2(name));
    }
// return karna padega tabhi value change ho paegi.
     static void change(String naam) {
        naam="abc"; //creating a new object
    }
    static String change2(String naam){
        naam="abc";
        return naam;
    }
}
