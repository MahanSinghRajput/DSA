package Basics;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //char ch= in.next.trim().charAt();  //to take single character

        char ch=in.next().trim().charAt(0);
        if(ch>='a' && ch<='z')
            System.out.println("Lowercase");
        else if(ch>='A' && ch<='B')
            System.out.println("Uppercase");
        else
            System.out.println("Invalid");
    }
}
