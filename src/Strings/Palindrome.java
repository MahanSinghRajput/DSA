package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(isPalindrome(a)) System.out.println("Given string is a palindrome");
        else System.out.println("Given string is not a palindrome");
    }
    static boolean isPalindrome(String str){
        if(str == null || str.isEmpty()) return true;
        str = str.toLowerCase();
        for (int i = 0; i <= str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end) return false;
        }
        return true;
    }
}
