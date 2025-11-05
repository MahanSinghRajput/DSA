package Basics;
import java.util.Scanner;
public class switches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // a.equals(b); checks if a is equal to b.
        String fruit = in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Red fruit");
            case "Orange" -> System.out.println("Orange in colour");
            default -> System.out.println("Fruit not identified");
        }
        
        /*
            switch(fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;

            case "Apple":
                System.out.println("Red fruit");
                break;
            case "Orange":
                System.out.println("Orange in colour");
                break;
            default:
                System.out.println("Fruit not identified");
        }
         */
    }
}
