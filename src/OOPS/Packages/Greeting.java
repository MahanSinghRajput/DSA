package OOPS.Packages;

import static OOPS.Packages.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("hello");
        message(); //this method is being called from another file Message.java
    }
}
